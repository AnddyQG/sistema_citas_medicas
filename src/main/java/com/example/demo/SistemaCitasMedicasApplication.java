package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.CitaMedica;
import com.example.demo.repo.modelo.Doctor;
import com.example.demo.repo.modelo.Paciente;
import com.example.demo.service.ICitaMedicaService;
import com.example.demo.service.IDoctorService;
import com.example.demo.service.IPacienteService;

@SpringBootApplication
public class SistemaCitasMedicasApplication implements CommandLineRunner{

	@Autowired
	private IDoctorService doctorService;
	

	@Autowired
	private IPacienteService iPacienteService;
	
	@Autowired
	private ICitaMedicaService citaMedicaService;
	
	public static void main(String[] args) {
		SpringApplication.run(SistemaCitasMedicasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//ingreso de 2 doctores
		/*
		Doctor doctor= new Doctor();
		doctor.setCedula("3050");
		doctor.setFechaNacimiento(LocalDate.of(2003, 7, 7));
		doctor.setNombre("Juliana");
		doctor.setNumeroConsultorio("777");
		doctor.setSalario(new BigDecimal(950));
		doctor.setTitulo("DENTAL");
		//this.doctorService.insertar(doctor);
		
		*/
		
		//Doctor doctorE=this.doctorService.buscar("1721");
		//System.out.println(doctorE);
		
		//ingreso de 2 pacientes
		/*
		Paciente paciente= new Paciente();
		paciente.setApellido("Quisilema");
		paciente.setCedula("1710");
		paciente.setCodigoIess("ASS123");
		paciente.setEstatura("1.65");
		paciente.setFechaNacimiento(LocalDate.of(1999, 10, 10));
		paciente.setGenero("Masculino");
		paciente.setNombre("Rafael");
		paciente.setPeso("150");
		
		this.iPacienteService.insertar(paciente);
		Paciente paciente2= new Paciente();
		paciente2.setApellido("Guacollante");
		paciente2.setCedula("1234");
		paciente2.setCodigoIess("ASS111");
		paciente2.setEstatura("1.55");
		paciente2.setFechaNacimiento(LocalDate.of(1987, 10, 10));
		paciente2.setGenero("Femenino");
		paciente2.setNombre("Mirian");
		paciente2.setPeso("170");
		this.iPacienteService.insertar(paciente2);
		*/
		

		
	//	this.citaMedicaService.agregar("654", LocalDate.now(), new BigDecimal(1000), "Calderon","3050" , "1234");
	

		//this.citaMedicaService.actualizarPorNumero("654", "A MEJORADO", "BEPANTOL 1", LocalDate.of(2025, 10, 10));
		
		
		
	}

}
