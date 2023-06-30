package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.example.demo.repo.modelo.CitaMedica;



public interface ICitaMedicaService {
	
	public void agregar(String numeroTurno,LocalDate fechaCita,BigDecimal costoCita,String lugarCita, String cedulaDocto,String cedulaPaciente);

	
	public CitaMedica buscarPorNumero(String numero);
	public void actualizarPorNumero(String numero,String diagnostico,String receta,LocalDate fechaControl);
	
	
	
}
