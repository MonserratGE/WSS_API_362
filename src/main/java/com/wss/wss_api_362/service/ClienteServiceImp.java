package com.wss.wss_api_362.service;

import com.wss.wss_api_362.model.Cliente;
import com.wss.wss_api_362.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImp implements ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteServiceImp(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente getCliente(Integer id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElse(null);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {
        return null;
    }
}
