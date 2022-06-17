package com.wss.wss_api_362.service;

import com.wss.wss_api_362.model.Producto;
import com.wss.wss_api_362.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoServiceImp implements ProductoService{
	
	ProductoRepository productoRepository;

	public ProductoServiceImp(@Autowired ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}

	@Override
	public Producto getProductoById(Integer id) {
		return productoRepository.getById(id);
	}

	@Override
	public List<Producto> getProductos() {
		return productoRepository.findAll();
	}
}
