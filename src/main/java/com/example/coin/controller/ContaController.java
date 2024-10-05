package com.example.coin.controller;


import com.example.coin.model.Conta;
import com.example.coin.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contas")
@CrossOrigin(origins = "http://localhost:3000")  // Permite o acesso do front-end React
public class ContaController {

    @Autowired
    private ContaService contaService;

    @GetMapping
    public List<Conta> getAllContas() {
        return contaService.getAllContas();
    }

    @GetMapping("/{id}")
    public Optional<Conta> getContaById(@PathVariable Long id) {
        return contaService.getContaById(id);
    }

    @PostMapping
    public Conta createConta(@RequestBody Conta conta) {
        return contaService.saveConta(conta);
    }

    @PutMapping("/{id}")
    public Conta updateConta(@PathVariable Long id, @RequestBody Conta conta) {
        conta.setId(id);
        return contaService.saveConta(conta);
    }

    @DeleteMapping("/{id}")
    public void deleteConta(@PathVariable Long id) {
        contaService.deleteConta(id);
    }
}







