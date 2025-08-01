package dev.bkTeck.x._0.Cadastro_de_Usuarios.controller;


import dev.bkTeck.x._0.Cadastro_de_Usuarios.model.CadastroModel;
import dev.bkTeck.x._0.Cadastro_de_Usuarios.service.UsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Cadastro")
public class UsController {

    private final UsService usService;

    public UsController(UsService usService) {
        this.usService = usService;
    }

    @GetMapping
    public List<CadastroModel> getAll(){return usService.getAll();}

    @PostMapping
    public CadastroModel create(@RequestBody CadastroModel cadastroModel) {
        return usService.save(cadastroModel);
    }
}
