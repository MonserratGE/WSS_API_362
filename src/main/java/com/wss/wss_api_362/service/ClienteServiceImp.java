package com.wss.wss_api_362.service;

import com.wss.wss_api_362.model.Cliente;
import com.wss.wss_api_362.repository.ClienteRepository;

import java.util.Optional;

public class ClienteServiceImp implements ClienteService {

    ClienteRepository clienteRepository;

    @Override
    public Cliente getCliente(Integer id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElse(null);
    }

    @Override
    public ClienteService saveCliente(ClienteService cliente) {
        return null;
    }

    @Override
    public Boolean deleteCliente(Integer id) {
        return null;
    }

    @Override
    public ClienteService updateCliente(ClienteService cliente) {
        return null;
    }
}
