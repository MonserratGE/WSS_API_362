package com.wss.wss_api_362.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wss.wss_api_362.model.Categoria;
import com.wss.wss_api_362.service.CategoriaService;

@RestController
@RequestMapping("api/categoria")
public class CategoriaController {
	
	CategoriaService categoriaService;
	
	public CategoriaController(@Autowired CategoriaService categoriaService) {
		this.categoriaService = categoriaService;
	}
	
	@GetMapping("/{id_categoria}")
	public Categoria getCategoria(@PathVariable Integer id_categoria) {
		return categoriaService.getCategoria(id_categoria);
	}

	@GetMapping("/all")
	public List<Categoria> getProductos(){
		return categoriaService.getCategorias();
	}
	
	
	// ************************* Escribir ************************* 
	@PostMapping
	public Categoria saveCategoria(@RequestBody Categoria categoria) {
		return categoriaService.saveCategoria(categoria);
	}
	
	// *************************  Borrar ************************* 
	@DeleteMapping("delete/{id_categoria}")
	public void deleteCategoria(@PathVariable Integer id_categoria) {
		categoriaService.deleteCategoria(id_categoria);
	}
	
	// *************************  Actualizar ************************* 
	@PutMapping
	public Categoria updateCategoria(@RequestBody Categoria categoria) {
		return categoriaService.updateCategoria(categoria);
	}

}
