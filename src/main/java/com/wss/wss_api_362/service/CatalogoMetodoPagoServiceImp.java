package com.wss.wss_api_362.service;

import com.wss.wss_api_362.model.CatalogoMetodoPago;
import com.wss.wss_api_362.repository.CatalogoMetodoPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogoMetodoPagoServiceImp implements CatalogoMetodoPagoService {

    CatalogoMetodoPagoRepository catalogoMetodoPagoRepository;

    public CatalogoMetodoPagoServiceImp(@Autowired CatalogoMetodoPagoRepository catalogoMetodoPagoRepository) {
        this.catalogoMetodoPagoRepository = catalogoMetodoPagoRepository;
    }
    @Override
    public List<CatalogoMetodoPago> getCatalogoMetodoPagos() {
        return (List<CatalogoMetodoPago>) catalogoMetodoPagoRepository.findAll();
    }
}
