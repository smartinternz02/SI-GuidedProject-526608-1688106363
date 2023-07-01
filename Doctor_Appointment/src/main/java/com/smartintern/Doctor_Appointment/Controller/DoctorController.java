package com.smartintern.Doctor_Appointment.Controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smartintern.Doctor_Appointment.Model.Doctor_Data;
import com.smartintern.Doctor_Appointment.Repo.Doctor_Repo;
import com.smartintern.Doctor_Appointment.Service.DoctorLogin;

@Controller
public class DoctorController {
	@Autowired 
	Doctor_Repo repo;
	private DoctorLogin doctorLogin;
	
	@GetMapping("/doctor_login")
	public String doctor_login() {
		return "doctor_login";	
	}
	@PostMapping(value="/doctor_reg")
	public String doctorreg() {
		return "doctor_reg";
	}
	@GetMapping("/doctor_reg")
	public String doctor_reg() {
		return "doctor_reg";	
	}
	@PostMapping(value="/d_success")
	public String Success(Doctor_Data data) {
		repo.save(data);
		return "d_success";
	}
	@GetMapping("/d_success")
	public String Successs() {
		return "d_success";	
	}
	@PostMapping(value="/doctor_home")
	public String doctorhome(@ModelAttribute("login") Doctor_Data login) {
		Doctor_Data doctor_login=doctorLogin.login(login.getUsername(),login.getPassword());
		if(Objects.nonNull(doctor_login)) {
			return "doctor_home";
		}else {
			return "doctor_login";
		}
	}
	@GetMapping("/doctor_home")
	public String doctor_home() {
		return "doctor_home";	
	}
	@PostMapping(value="/confirm_patient")
	public String confirmpatient() {
		return "confirm_patient";
	}
	@GetMapping("/confirm_patient")
	public String confirm_patient() {
		return "confirm_patient";	
	}
	@RequestMapping("/confirm")
	public String confirm() {
		return "confirm";	
	}
	@RequestMapping("/reject")
	public String reject() {
		return "reject";	
	}
}
