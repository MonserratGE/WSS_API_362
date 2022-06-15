package com.wss.wss_api_362.service;

import com.wss.wss_api_362.model.FilaCompra;
import com.wss.wss_api_362.repository.FilaCompraRepository;

import java.util.List;
import java.util.Optional;

public class FilaCompraServiceImp implements FilaCompraService {

    private final FilaCompraRepository filaCompraRepository;

    public FilaCompraServiceImp(FilaCompraRepository filaCompraRepository) {
        this.filaCompraRepository = filaCompraRepository;
    }


    @Override
    public Producto getFilaCompra(Integer id) {
        Optional<Producto> filaCompra = filaCompraRepository.findById(id);
        return filaCompra.orElse(null);
    }

    @Override
    public List<Producto> getFilaCompras() {
        return (List<Producto>) filaCompraRepository.findAll();
    }

    @Override
    public FilaCompra saveFilaCompra(FilaCompra filaCompra) {
        return null;
    }
}
