package com.p1.klu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.apiclub.captcha.Captcha;

@Controller
public class SpringController {
	
	@Autowired
	  DAO dao;
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	  @ResponseBody
	   public String fun1() {
	     return "welcome";
	   }
	 @GetMapping("/registration")
	  public String fun2(Model m) {
	    Doctor d = new Doctor();
	    m.addAttribute("command", d);
	    return "registration.jsp";
	  }
	 @PostMapping("/register")
	  public String fun3(@ModelAttribute("d") Doctor d) {
	      dao.register(d);
	      System.out.println("Inserted Successfully");
	      return "redirect:/login";
	  }
	 
	 @GetMapping("/login")
	  public String fun4(Model m) {
	    Doctor d = new Doctor();
	    Captcha captcha = CaptchaService.createCaptcha(200, 70);
	    d.setRealCaptcha(CaptchaService.encodeCaptcha(captcha));
	    d.setHiddenCaptcha(captcha.getAnswer());
	    d.setCaptcha("");
	    m.addAttribute("command", d);
	    return "login.jsp";
	  }
	 @PostMapping("/validate")
	 public String fun5(@ModelAttribute("d") Doctor d, @RequestParam("name") String name, @RequestParam("password") String password) {
	     if (d.hiddenCaptcha.equalsIgnoreCase(d.captcha) && dao.isNameAndPasswordMatch(name, password)) {
	         System.out.println("Login Successful");
	         return "redirect:/show";
	     } else {
	         System.out.println("Login Failed");
	         return "redirect:/registration";
	     }
	 }
	 @GetMapping("/show")
	  public String fun6(Model m) {
	    List<Patient> ul = dao.getAll();
	    m.addAttribute("ul", ul);
	    return "show.jsp";
	  }
	 @GetMapping("/add")
	  public String fun7(Model m) {
	    Patient p = new Patient();
	    m.addAttribute("command", p);
	    return "add.jsp";
	  }
	 @PostMapping("/save")
	  public String fun8(@ModelAttribute("p") Patient p) {
	      dao.add(p);
	      System.out.println("Inserted Successfully");
	      return "redirect:/show";
	  }
	 @GetMapping("/updatepatient")
	  public String fun9(Model m) {
	    Patient p = new Patient();
	    m.addAttribute("command", p);
	    return "update.jsp";
	  }
	 
	 
		
	 @PostMapping("/update")
	 public String updatePatient(@ModelAttribute("p") Patient updatedPatient) {
	     dao.updatePatient(updatedPatient);
	     System.out.println("Updated Successfully");
	     return "redirect:/show";
	 }
	 @GetMapping("/delete")
	    public String showDeleteUserForm() {
	        return "delete.jsp";
	    }

	    @PostMapping("/deleteUser")
	    public String deleteUser(@RequestParam("username") String username) {
	        boolean deleted = dao.deleteUserByUsername(username);
	        if (deleted) {
	            System.out.println("User deleted successfully");
	        } else {
	            System.out.println("User not found or delete failed");
	        }
	        return "redirect:/show"; 
	    }	
	    @GetMapping("/map")
	    public String fun69() {
	        return "map.html";
	    }
}
