package com.wss.wss_api_362.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wss.wss_api_362.model.Compra;
import com.wss.wss_api_362.service.CompraService;
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,
        RequestMethod.PUT })

@RestController
@RequestMapping("/api/compra")
public class CompraController {

	CompraService compraService;
	
	public CompraController(@Autowired CompraService compraService) {
		this.compraService = compraService;
	}
	
	@GetMapping("/{id}")
	public Compra getCompra(@PathVariable Integer id) {
		return compraService.getCompra(id);
	}
	
	@GetMapping("/all")
	public List<Compra> getCompras(){
		return compraService.getCompras();
	}
	
	
	// Escribir 
	@PostMapping
	public Compra saveCompra(@RequestBody Integer compra) {
		return compraService.saveCompra(compra);
	}

	/**
	 * // Borrar
	 *        @DeleteMapping("delete/{id}")
	 *    public void deleteCompra(@PathVariable Integer id) {
	 * 		compraService.deleteCompra(id);
	 *    }
	 *
	 * 	// Actualizar
	 *    @PutMapping
	 *    public Compra updateCompra(@RequestBody Integer compra) {
	 * 		return compraService.updateCompra(compra);
	 *    }
	 *
	 */
}
