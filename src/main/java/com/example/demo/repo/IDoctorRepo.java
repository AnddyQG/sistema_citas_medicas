package com.example.demo.repo;

import com.example.demo.repo.modelo.Doctor;

public interface IDoctorRepo {

	public void agregar(Doctor doctor);
	public void actualizar(Doctor doctor);
	public Doctor encontrar(String cedula);
	public void eliminar(String cedula);
	
}
