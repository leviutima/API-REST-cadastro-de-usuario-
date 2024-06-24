package com.loginpage.apiLogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loginpage.apiLogin.usuario.DadosCadastroUsuario;
import com.loginpage.apiLogin.usuario.Usuario;
import com.loginpage.apiLogin.usuario.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastro(@RequestBody DadosCadastroUsuario dados) {
        repository.save(new Usuario(dados));
    }
}
