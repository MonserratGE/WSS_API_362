package com.wss.wss_api_362.service;

import com.wss.wss_api_362.model.FilaCompra;

import java.util.List;

public interface FilaCompraService {

    Producto getFilaCompra(Integer id);

    List<Producto> getFilaCompras();

    FilaCompra saveFilaCompra(FilaCompra filaCompra);

}
