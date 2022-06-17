package com.wss.wss_api_362.controller;

import com.wss.wss_api_362.model.CatalogoMetodoPago;
import com.wss.wss_api_362.service.CatalogoMetodoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT })
@RequestMapping("api/catalogo_metodo_pago")
public class CatalogoMetodoPagoController {

    CatalogoMetodoPagoService catalogoMetodoPagoService;

    public CatalogoMetodoPagoController(@Autowired CatalogoMetodoPagoService catalogoMetodoPagoService) {
        this.catalogoMetodoPagoService = catalogoMetodoPagoService;
    }

    @GetMapping("/all")
    public List<CatalogoMetodoPago> getCatalogoMetodoPagos() {
        return catalogoMetodoPagoService.getCatalogoMetodoPagos();
    }
}
