package com.wss.wss_api_362.service;

import com.wss.wss_api_362.model.ReciboPago;

import java.util.List;

public interface ReciboPagoService {

    List<ReciboPago> obtenerReciboByClienteId(Integer idCliente);

    ReciboPago saveReciboPago(ReciboPago reciboPago);



}
