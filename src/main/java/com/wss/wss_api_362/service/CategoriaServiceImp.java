package com.wss.wss_api_362.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wss.wss_api_362.model.Categoria;
import com.wss.wss_api_362.repository.CategoriaRepository;


@Service
public class CategoriaServiceImp implements CategoriaService{
	
	CategoriaRepository categoriaRepository;
	
	public CategoriaServiceImp(@Autowired CategoriaRepository categoriaRepository) {
		this.categoriaRepository = categoriaRepository;
	}
	
	@Override
	public Categoria getCategoria(Integer id_categoria) {
		Optional<Categoria> categoria = categoriaRepository.findById(id_categoria);
		return categoria.orElse(null);
	}

	@Override
	public List<Categoria> getCategorias() {
		return categoriaRepository.findAll();
	}


	@Override
	public Categoria saveCategoria(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}

	@Override
	public Boolean deleteCategoria(Integer id_categoria) {
		try {
			categoriaRepository.deleteById(id_categoria);
			return true;
		}catch(Exception err){
			return false;
		}
		
	}

	@Override
	public Categoria updateCategoria(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}

	

}
