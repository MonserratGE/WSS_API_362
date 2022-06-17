package com.wss.wss_api_362.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wss.wss_api_362.model.Compra;
import com.wss.wss_api_362.repository.CompraRepository;


@Service
public class CompraServiceImp implements CompraService{
	
	CompraRepository compraRepository;
	
	public CompraServiceImp(@Autowired CompraRepository compraRepository) {
		this.compraRepository = compraRepository;
	}

	@Override
	public Compra getCompra(Integer id) {
		Optional<Compra> compra = compraRepository.findById(id);
		return compra.orElse(null);
	}

	@Override
	public List<Compra> getCompras() {
		return compraRepository.findAll();
	}

	@Override
	public Compra saveCompra(Integer compra) {
		return compraRepository.save(compra);
	}

	/**
	 *
	 @Override
	 public Boolean deleteCompra(Integer id) {
	 try {
	 compraRepository.deleteById(id);
	 return true;
	 }catch(Exception err) {
	 return false;
	 }
	 }

	 @Override
	 public Compra updateCompra(Integer compra) {
	 return compraRepository.save(compra);
	 }

	 */
}
