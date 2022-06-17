package com.wss.wss_api_362.service;

import com.wss.wss_api_362.model.ReciboPago;
import com.wss.wss_api_362.repository.ReciboPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReciboPagoServiceImp implements ReciboPagoService {

    private final ReciboPagoRepository reciboPagoRepository;

    public ReciboPagoServiceImp(@Autowired ReciboPagoRepository reciboPagoRepository) {
        this.reciboPagoRepository = reciboPagoRepository;
    }

    @Override
    public List<ReciboPago> obtenerReciboByClienteId(Integer idCliente) {
        return reciboPagoRepository.obtenerReciboByClienteId(idCliente);
    }

    @Override
    public ReciboPago saveReciboPago(ReciboPago reciboPago) {
        return reciboPagoRepository.save(reciboPago);
    }

}
