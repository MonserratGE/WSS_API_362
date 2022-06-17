package com.wss.wss_api_362.service;

import com.wss.wss_api_362.model.FilaCompra;
import com.wss.wss_api_362.model.Producto;
import com.wss.wss_api_362.repository.FilaCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilaCompraServiceImp implements FilaCompraService {

    private final FilaCompraRepository filaCompraRepository;

    public FilaCompraServiceImp(@Autowired FilaCompraRepository filaCompraRepository) {
        this.filaCompraRepository = filaCompraRepository;
    }


    @Override
    public FilaCompra getFilaCompra(Integer id) {
        Optional<FilaCompra> filaCompra = filaCompraRepository.findById(id);
        return filaCompra.orElse(null);
    }

    @Override
    public List<FilaCompra> getFilaCompras() {
        return (List<FilaCompra>) filaCompraRepository.findAll();
    }

    @Override
    public FilaCompra saveFilaCompra(FilaCompra filaCompra) {
        return filaCompraRepository.save(filaCompra);
    }

    @Override
    public FilaCompra updateFilaCompra(FilaCompra filaCompra) {
        return filaCompraRepository.save(filaCompra);
    }
}
