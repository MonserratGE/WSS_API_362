package com.wss.wss_api_362.service;

import java.util.List;

import com.wss.wss_api_362.model.Compra;

public interface CompraService {
	
	Compra getCompra(Integer id);
	
	List<Compra> getCompras();
	Compra saveCompra(Integer compra);

/**
 *
 * 	Boolean deleteCompra(Integer id);
 *
 * 	Compra updateCompra(Integer compra);
 *
 */
}
