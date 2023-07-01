package com.smartintern.Doctor_Appointment.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartintern.Doctor_Appointment.Model.Patient_Data;
public interface Patient_Repo extends JpaRepository<Patient_Data,Integer>{
	Patient_Data findByUsernameAndPassword(String username,String password);
}
