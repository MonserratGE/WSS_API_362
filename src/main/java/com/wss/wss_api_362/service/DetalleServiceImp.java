package com.wss.wss_api_362.service;

import com.wss.wss_api_362.model.DetalleCliente;
import com.wss.wss_api_362.repository.DetalleClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class DetalleServiceImp implements DetalleClienteService {

    DetalleClienteRepository detalleClienteRepository;

    public DetalleServiceImp(@Autowired DetalleClienteRepository detalleClienteRepository) {
        this.detalleClienteRepository = detalleClienteRepository;
    }

    @Override
    public DetalleCliente getDetalleCliente(Integer id) {
        Optional<DetalleCliente> detalleCliente = detalleClienteRepository.findById(id);
        return detalleCliente.orElse(null);
    }

    @Override
    public List<Map<String, Object>> getDetalleClientes() {
        return detalleClienteRepository.obtenerDetalleClientes();
    }

    @Override
    public DetalleCliente saveDetalleCliente(DetalleCliente detalleCliente) {
        return detalleClienteRepository.save(detalleCliente);
    }

    @Override
    public Boolean deleteDetalleCliente(Integer id) {
        return null;
    }

    @Override
    public DetalleCliente updateDetalleCliente(DetalleCliente detalleCliente) {
        return null;
    }
}
