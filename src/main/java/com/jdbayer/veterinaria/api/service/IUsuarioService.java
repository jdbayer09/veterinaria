package com.jdbayer.veterinaria.api.service;

import com.jdbayer.veterinaria.api.entity.Usuario;

public interface IUsuarioService {
    Usuario findByEmail(String email);

    Usuario findById(Long id);
}
