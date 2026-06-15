package Biblioteka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Biblioteka.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}