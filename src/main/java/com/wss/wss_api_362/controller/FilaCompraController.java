package com.wss.wss_api_362.controller;

import com.wss.wss_api_362.model.Producto;
import com.wss.wss_api_362.service.FilaCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT })
@RequestMapping("api/filaCompra")
public class FilaCompraController {


}
