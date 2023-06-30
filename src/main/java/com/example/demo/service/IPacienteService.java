package com.example.demo.service;

import com.example.demo.repo.modelo.Paciente;

public interface IPacienteService {

	
	public void insertar(Paciente paciente);
	public void actualizar(Paciente paciente);
	public Paciente buscar(String cedula);
	public void borrar(String cedula);
	
	
	
}
