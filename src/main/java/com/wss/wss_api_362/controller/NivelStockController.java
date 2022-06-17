package com.wss.wss_api_362.controller;

import com.wss.wss_api_362.model.NivelStock;
import com.wss.wss_api_362.service.NivelStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/nivel_stock")

public class NivelStockController {

    private final NivelStockService nivelStockService;

    public NivelStockController(@Autowired NivelStockService nivelStockService) {
        this.nivelStockService = nivelStockService;
    }

    @GetMapping("/{id}")
    public NivelStock getNivelStockById(@PathVariable Integer id) {
        return nivelStockService.getNivelStockById(id);
    }

}
