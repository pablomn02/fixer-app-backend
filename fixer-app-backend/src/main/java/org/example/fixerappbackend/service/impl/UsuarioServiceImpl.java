package org.example.fixerappbackend.service.impl;

import org.example.fixerappbackend.model.Usuario;
import org.example.fixerappbackend.repo.UsuarioRepo;
import org.example.fixerappbackend.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepo usuarioRepo;

    @Override
    public List<Usuario> findAll() {
        return usuarioRepo.findAll();
    }
}
