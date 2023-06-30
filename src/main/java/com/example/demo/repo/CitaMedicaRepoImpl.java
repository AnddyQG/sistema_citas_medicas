package com.example.demo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.CitaMedica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class CitaMedicaRepoImpl implements ICitaMedicaRepo{

	@Autowired
	private EntityManager entityManager;
	
	
	@Override
	public void agregar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.persist(citaMedica);
	}


	@Override
	public CitaMedica encontarPorNumero(String numero) {
		// TODO Auto-generated method stub
		TypedQuery<CitaMedica>query=this.entityManager.createQuery("SELECT e FROM CitaMedica e WHERE e.numeroTurno = :datoNumero",CitaMedica.class);
		query.setParameter("datoNumero", numero);
		return query.getSingleResult();
	}


	@Override
	public void actualizarPorNumero(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.merge(citaMedica);
		
	}

}
