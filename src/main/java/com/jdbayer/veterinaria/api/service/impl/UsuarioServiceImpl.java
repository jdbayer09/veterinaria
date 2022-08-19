package com.jdbayer.veterinaria.api.service.impl;

import com.jdbayer.veterinaria.api.entity.Usuario;
import com.jdbayer.veterinaria.api.repository.IUsuarioRepository;
import com.jdbayer.veterinaria.api.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    @Transactional(readOnly = true)
    public Usuario findByEmail(String email) {
        return usuarioRepository.findUsuarioByEmail(email);
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }
}
