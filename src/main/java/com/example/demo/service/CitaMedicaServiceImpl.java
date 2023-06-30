package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.ICitaMedicaRepo;
import com.example.demo.repo.IDoctorRepo;
import com.example.demo.repo.IPacienteRepo;
import com.example.demo.repo.modelo.CitaMedica;
import com.example.demo.repo.modelo.Doctor;
import com.example.demo.repo.modelo.Paciente;
@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{

	@Autowired
	private IDoctorRepo doctorRepo;
	@Autowired
	private IPacienteRepo iPacienteRepo;
	@Autowired
	private ICitaMedicaRepo citaMedicaRepo;
	
	@Override
	public void agregar(String numeroTurno, LocalDate fechaCita, BigDecimal costoCita, String lugarCita,
			String cedulaDocto, String cedulaPaciente) {
		// TODO Auto-generated method stub
		Doctor doctor=this.doctorRepo.encontrar(cedulaDocto);
		Paciente paciente=this.iPacienteRepo.encontrar(cedulaPaciente);
		CitaMedica citaMedica=new CitaMedica();
		citaMedica.setNumeroTurno(numeroTurno);
		citaMedica.setFechaCita(fechaCita);
		citaMedica.setCostoCita(costoCita);
		citaMedica.setLugarCita(lugarCita);
		citaMedica.setDoctor(doctor);
		citaMedica.setPaciente(paciente);
		citaMedica.setDiagnostico("ESTA MAS MAL");
		citaMedica.setFechaControl(LocalDate.of(2021, 10, 11));
		citaMedica.setReceta("PARAETAMOL 500Ml");
		
		
		this.citaMedicaRepo.agregar(citaMedica);
		
		
		
		
		
	}

	@Override
	public CitaMedica buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.citaMedicaRepo.encontarPorNumero(numero);
	}

	@Override
	public void actualizarPorNumero(String numero, String diagnostico, String receta, LocalDate fechaControl) {
		// TODO Auto-generated method stub
		CitaMedica citaMedica= this.citaMedicaRepo.encontarPorNumero(numero);
		citaMedica.setDiagnostico(diagnostico);
		citaMedica.setReceta(receta);
		citaMedica.setFechaControl(fechaControl);
		this.citaMedicaRepo.actualizarPorNumero(citaMedica);
		
		
	}

	

}
