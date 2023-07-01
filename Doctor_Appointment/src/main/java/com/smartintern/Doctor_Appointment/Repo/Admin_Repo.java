package com.smartintern.Doctor_Appointment.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smartintern.Doctor_Appointment.Model.Admin_Data;
public interface Admin_Repo extends JpaRepository<Admin_Data,Integer>{
	Admin_Data findByUsernameAndPassword(String username,String password);

}
