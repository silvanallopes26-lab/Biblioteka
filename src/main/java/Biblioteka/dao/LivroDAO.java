package Biblioteka.dao;

import java.util.List;

import Biblioteka.entity.Livro;

public interface LivroDAO {

    Livro salvar(Livro livro);

    List<Livro> listarTodos();

    Livro buscarPorId(Long id);

    void deletar(Long id);
}