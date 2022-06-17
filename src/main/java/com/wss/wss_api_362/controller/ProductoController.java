package com.wss.wss_api_362.controller;

import com.wss.wss_api_362.model.Producto;
import com.wss.wss_api_362.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT })
@RequestMapping("api/producto")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(@Autowired ProductoService productoService) {
        this.productoService = productoService;
    }

    @RequestMapping("/{id}")
    public Producto getProductoById(@PathVariable Integer id) {
        return productoService.getProductoById(id);
    }

    @RequestMapping("/all")
    public List<Producto> getProductos() {
        return productoService.getProductos();
    }

}
