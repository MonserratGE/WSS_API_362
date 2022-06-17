package com.wss.wss_api_362.service;

import com.wss.wss_api_362.model.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente getCliente(Integer id);


    Cliente save(Cliente cliente);

    Cliente update(Cliente cliente);


}
