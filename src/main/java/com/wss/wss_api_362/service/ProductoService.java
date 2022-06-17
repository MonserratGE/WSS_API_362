package com.wss.wss_api_362.service;

import com.wss.wss_api_362.model.Producto;

import java.util.List;

public interface ProductoService {

    Producto getProductoById(Integer id);

    List<Producto> getProductos();

}
