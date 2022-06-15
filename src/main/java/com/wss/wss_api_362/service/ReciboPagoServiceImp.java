package com.wss.wss_api_362.service;

import com.wss.wss_api_362.model.ReciboPago;
import com.wss.wss_api_362.repository.ReciboPagoRepository;

import java.util.List;

public class ReciboPagoServiceImp implements ReciboPagoService {

    private final ReciboPagoRepository reciboPagoRepository;

    public ReciboPagoServiceImp(ReciboPagoRepository reciboPagoRepository) {
        this.reciboPagoRepository = reciboPagoRepository;
    }

    @Override
    public List<ReciboPago> findByClienteId(Integer idCliente) {
        return reciboPagoRepository.findByClienteId(idCliente);
    }

    @Override
    public ReciboPago save(ReciboPago post) {
        return null;
    }


}
