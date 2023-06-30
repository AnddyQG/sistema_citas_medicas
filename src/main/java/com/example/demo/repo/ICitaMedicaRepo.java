package com.example.demo.repo;

import com.example.demo.repo.modelo.CitaMedica;

public interface ICitaMedicaRepo {

	public void agregar(CitaMedica citaMedica);
	public CitaMedica encontarPorNumero(String numero);
	public void actualizarPorNumero(CitaMedica citaMedica);
	
}
