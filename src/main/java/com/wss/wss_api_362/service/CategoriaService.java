package com.wss.wss_api_362.service;

import java.util.List;

import com.wss.wss_api_362.model.Categoria;


public interface CategoriaService {

	Categoria getCategoria(Integer id_categoria);

	List<Categoria> getCategorias();

	Categoria saveCategoria(Categoria categoria);

	Boolean deleteCategoria(Integer id_categoria);

	Categoria updateCategoria(Categoria categoria);

}
