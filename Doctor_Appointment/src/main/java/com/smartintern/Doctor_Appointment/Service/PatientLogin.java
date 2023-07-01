package com.smartintern.Doctor_Appointment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smartintern.Doctor_Appointment.Model.Patient_Data;
import com.smartintern.Doctor_Appointment.Repo.Patient_Repo;

@Service
public class PatientLogin {
	@Autowired
	private Patient_Repo repo;
	public Patient_Data login(String username, String password) {
		Patient_Data login=repo.findByUsernameAndPassword(username, password);
		return login;
	}
}
