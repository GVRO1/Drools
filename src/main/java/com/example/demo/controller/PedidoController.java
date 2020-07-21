package com.example.demo.controller;

import com.example.demo.dto.PedidoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;


    @GetMapping
    public PedidoDto teste() {
        return new PedidoDto();
    }
    @PostMapping
    public PedidoDto adicionarPedido(@RequestBody PedidoDto pedido) {
        return pedidoService.adicionarPedido(pedido);
     }

}
