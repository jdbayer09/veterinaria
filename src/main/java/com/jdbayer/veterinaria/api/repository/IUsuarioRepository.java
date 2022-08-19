package com.jdbayer.veterinaria.api.repository;

import com.jdbayer.veterinaria.api.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario, Long> {

    Usuario findUsuarioByEmail(String email);
}
