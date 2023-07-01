package com.smartintern.Doctor_Appointment.Controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.smartintern.Doctor_Appointment.Model.Admin_Data;
import com.smartintern.Doctor_Appointment.Service.AdminLogin;

@Controller
public class AdminController {
	@Autowired
	private AdminLogin adminLogin;
	
	@GetMapping("/admin_login")
	public String admin_login() {
		return "admin_login";	
	}
	@PostMapping("/admin_home")
	public String adminhome(@ModelAttribute("login") Admin_Data login) {
		Admin_Data admin_login=adminLogin.login(login.getUsername(),login.getPassword());
		if(Objects.nonNull(admin_login)) {
			return "admin_home";
		}else {
			return "admin_login";
		}
	}
	@GetMapping("/admin_home")
	public String admin_home() {
		return "admin_home";	
	}
	@PostMapping("/view_doctor")
	public String admindoctor() {
		return "view_doctor";
	}
	@GetMapping("/view_doctor")
	public String admin_doctor() {
		return "view_doctor";
	}
	@PostMapping("/view_patient")
	public String adminpatient() {
		return "view_patient";
	}
	@GetMapping("/view_patient")
	public String admin_patient() {
		return "view_patient";
	}
}
