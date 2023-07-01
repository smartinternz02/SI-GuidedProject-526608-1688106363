package com.smartintern.Doctor_Appointment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smartintern.Doctor_Appointment.Model.Doctor_Data;
import com.smartintern.Doctor_Appointment.Repo.Doctor_Repo;

@Service
public class DoctorLogin {
	@Autowired
	private Doctor_Repo repo;
	public Doctor_Data login(String username, String password) {
		Doctor_Data login=repo.findByUsernameAndPassword(username, password);
		return login;
	}
}
