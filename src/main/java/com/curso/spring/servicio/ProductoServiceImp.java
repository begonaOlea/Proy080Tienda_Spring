package com.curso.spring.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.curso.spring.entidades.Producto;
import com.curso.spring.repositorio.GenericRepositorio;

@Service
@Transactional
public class ProductoServiceImp  implements ProductoService{

	@Autowired 
	@Qualifier("ProductoJPARepository")
	private GenericRepositorio<Producto,Integer> productoRepositorio;

	@Override
	public Producto crearProducto(Producto p) {
		return productoRepositorio.create(p);
	}

}
