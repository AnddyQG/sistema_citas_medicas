package com.example.demo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class PacienteRepoImpl implements IPacienteRepo{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void agregar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(paciente);
	}

	@Override
	public void actualiza(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(paciente);
	}

	@Override
	public Paciente encontrar(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Paciente>query=this.entityManager.createQuery("SELECT e FROM Paciente e WHERE e.cedula = :datoCedula",Paciente.class);
		query.setParameter("datoCedula", cedula);
		return query.getSingleResult();
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		Paciente paciente=this.encontrar(cedula);
		this.entityManager.remove(paciente);
	}

}
