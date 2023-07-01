package com.smartintern.Doctor_Appointment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smartintern.Doctor_Appointment.Model.Admin_Data;
import com.smartintern.Doctor_Appointment.Repo.Admin_Repo;

@Service
public class AdminLogin {
	@Autowired
	private Admin_Repo repo;
	public Admin_Data login(String username, String password) {
		Admin_Data login=repo.findByUsernameAndPassword(username, password);
		return login;
	}
}
