package com.p1.klu;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Doctor {
@Id
String name;
String graduationdetails;
int age;
String gender;
String address;
@Transient
String realCaptcha;
@Transient
String hiddenCaptcha;
@Transient
String captcha;
String password;

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGraduationdetails() {
	return graduationdetails;
}
public void setGraduationdetails(String graduationdetails) {
	this.graduationdetails = graduationdetails;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getRealCaptcha() {
	return realCaptcha;
}
public void setRealCaptcha(String realCaptcha) {
	this.realCaptcha = realCaptcha;
}
public String getHiddenCaptcha() {
	return hiddenCaptcha;
}
public void setHiddenCaptcha(String hiddenCaptcha) {
	this.hiddenCaptcha = hiddenCaptcha;
}
public String getCaptcha() {
	return captcha;
}
public void setCaptcha(String captcha) {
	this.captcha = captcha;
}
@Override
public String toString() {
	return "Doctor [name=" + name + ", graduationdetails=" + graduationdetails + ", age=" + age + ", gender=" + gender
			+ ", address=" + address + ", realCaptcha=" + realCaptcha + ", hiddenCaptcha=" + hiddenCaptcha
			+ ", captcha=" + captcha + "]";
}
	
	
	
	
}
