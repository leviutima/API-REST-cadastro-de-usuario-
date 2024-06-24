package com.loginpage.apiLogin.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DadosCadastroUsuario(
    
    @NotBlank
    String nome, 
    @NotBlank
    @Email
    String email, 
    @NotBlank
    String senha, 
    @NotBlank
    String confirmacaoSenha) {

    public DadosCadastroUsuario {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);
        System.out.println("Confirmação de Senha: " + confirmacaoSenha);

        if (!senha.equals(confirmacaoSenha)) {
            throw new IllegalArgumentException("Senha e confirmação de senha devem ser iguais");
        }
    }
}
