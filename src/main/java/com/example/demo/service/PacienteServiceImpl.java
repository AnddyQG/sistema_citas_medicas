package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IPacienteRepo;
import com.example.demo.repo.modelo.Paciente;
@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private IPacienteRepo iPacienteRepo;
	
	
	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.iPacienteRepo.agregar(paciente);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.iPacienteRepo.actualiza(paciente);
	}

	@Override
	public Paciente buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.iPacienteRepo.encontrar(cedula);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		this.iPacienteRepo.eliminar(cedula);
	}

}
