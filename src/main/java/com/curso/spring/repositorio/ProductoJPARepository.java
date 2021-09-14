package com.curso.spring.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.curso.spring.entidades.Producto;

@Repository
@Qualifier("ProductoJPARepository")
public class ProductoJPARepository   
             implements GenericRepositorio<Producto, Integer> {

	@PersistenceContext EntityManager em; //Injecto EntityManager de la factoria

	@Override
	public Producto get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto create(Producto entidad) {
		em.persist(entidad);
		return entidad;
	}

	@Override
	public Producto update(Producto entidad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Producto> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
