package com.smartintern.Doctor_Appointment.Controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smartintern.Doctor_Appointment.Model.Patient_Data;
import com.smartintern.Doctor_Appointment.Repo.Patient_Repo;
import com.smartintern.Doctor_Appointment.Service.PatientLogin;

@Controller
public class PatientController {
	@Autowired
	Patient_Repo repo;
	private PatientLogin patientLogin;
	
	@GetMapping("/patient_login")
	public String patient_login() {
		return "patient_login";	
	}
	@RequestMapping("/home")
	public String _home() {
		return "home";
	}
	@PostMapping(value="/patient_reg")
	public String patientreg() {
		return "patient_reg";
	}
	@GetMapping("/patient_reg")
	public String patient_reg() {
		return "patient_reg";	
	}
	@PostMapping(value="/p_success")
	public String Success(Patient_Data data) {
		repo.save(data);
		return "p_success";
	}
	@GetMapping("/p_success")
	public String Successs() {
		return "p_success";	
	}
	@RequestMapping("/patient_home")
	public String patient_home(@ModelAttribute("login") Patient_Data login) {
		Patient_Data patient_login=patientLogin.login(login.getUsername(),login.getPassword());
		if(Objects.nonNull(patient_login)) {
			return "patient_home";
		}else {
			return "patient_login";
		}
	}
	@RequestMapping("/confirm_doctor")
	public String confirm_doctor() {
		return "confirm_doctor";
	}
	@RequestMapping("/wait_doctor")
	public String wait_doctor() {
		return "wait_doctor";
	}
}
