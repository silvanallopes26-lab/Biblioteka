package Biblioteka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Biblioteka.entity.Livro;

public interface LivroRepository
        extends JpaRepository<Livro, Long> {

}