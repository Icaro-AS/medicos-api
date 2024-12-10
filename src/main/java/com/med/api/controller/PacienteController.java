package com.med.api.controller;

import com.med.api.paciente.DadosCadastroPaciente;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PacienteController {
    public void cadastras(@RequestBody DadosCadastroPaciente dados){
        System.out.println(dados);
    }
}
