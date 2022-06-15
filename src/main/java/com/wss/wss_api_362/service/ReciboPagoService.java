package com.wss.wss_api_362.service;

import com.wss.wss_api_362.model.ReciboPago;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReciboPagoService {

    /**
     * Obtiene un recibo de pago por id de cliente
     * @param idCliente
     * @return
     */
    List<ReciboPago> findByClienteId(Integer idCliente);

    ReciboPago save(ReciboPago post);



}
