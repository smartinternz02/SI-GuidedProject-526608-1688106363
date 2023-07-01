package com.smartintern.Doctor_Appointment.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	@GetMapping("/login")
	public String login() {
		return "login";	
	}
	@PostMapping(value="/admin_login")
	public String adminlogin() {
		return "admin_login";
	}
//	@GetMapping("/admin_login")
//	public String admin_login() {
//		return "admin_login";	
//	}
	@PostMapping(value="/doctor_login")
	public String doctorlogin() {
		return "doctor_login";
	}
//	@GetMapping("/doctor_login")
//	public String doctor_login() {
//		return "doctor_login";	
//	}
	@PostMapping(value="/patient_login")
	public String patientlogin() {
		return "patient_login";
	}
//	@GetMapping("/patient_login")
//	public String patient_login() {
//		return "patient_login";	
//	}
//	@PostMapping(value="/doctor_reg")
//	public String doctorreg() {
//		return "doctor_reg";
//	}
//	@GetMapping("/doctor_reg")
//	public String doctor_reg() {
//		return "doctor_reg";	
//	}
//	@PostMapping(value="/patient_reg")
//	public String patientreg() {
//		return "patient_reg";
//	}
//	@GetMapping("/patient_reg")
//	public String patient_reg() {
//		return "patient_reg";	
//	}
//	@PostMapping(value="/Success")
//	public String Success() {
//		return "Success";
//	}
//	@GetMapping("/Success")
//	public String Successs() {
//		return "Success";	
//	}
}
