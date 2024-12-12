package com.med.api.medico;

import com.med.api.endereco.DadosEndereco;

public record DadosCadastroMedico(
        String nome,
        String telefone,
        String email,
        String crm,
        Especialidade especialidade,
        DadosEndereco endereco) {
}
