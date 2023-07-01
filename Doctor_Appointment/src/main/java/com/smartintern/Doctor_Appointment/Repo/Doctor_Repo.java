package com.smartintern.Doctor_Appointment.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smartintern.Doctor_Appointment.Model.Doctor_Data;
public interface Doctor_Repo extends JpaRepository<Doctor_Data,Integer>{
	Doctor_Data findByUsernameAndPassword(String username,String password);
	
}
