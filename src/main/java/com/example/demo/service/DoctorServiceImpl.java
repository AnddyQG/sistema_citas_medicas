package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IDoctorRepo;
import com.example.demo.repo.modelo.Doctor;
@Service
public class DoctorServiceImpl implements IDoctorService{

	@Autowired
	private IDoctorRepo doctorRepo;
	
	@Override
	public void insertar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepo.agregar(doctor);
	}

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepo.actualizar(doctor);
	}

	@Override
	public Doctor buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.doctorRepo.encontrar(cedula);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		this.doctorRepo.eliminar(cedula);
	}

}
