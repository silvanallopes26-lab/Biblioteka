package Biblioteka.service;

import java.util.List;

import org.springframework.stereotype.Service;

import Biblioteka.entity.Livro;
import Biblioteka.repository.LivroRepository;

@Service
public class LivroService {

    private final LivroRepository repository;

    public LivroService(LivroRepository repository) {
        this.repository = repository;
    }

    public Livro salvar(Livro livro) {
        return repository.save(livro);
    }

    public List<Livro> listar() {
        return repository.findAll();
    }

    public Livro atualizar(Long id, Livro livroAtualizado) {

        Livro livro = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Livro não encontrado"));

        livro.setTitulo(livroAtualizado.getTitulo());
        livro.setAutor(livroAtualizado.getAutor());
        livro.setPreco(livroAtualizado.getPreco());

        return repository.save(livro);
    }

    public void excluir(Long id) {

        if (!repository.existsById(id)) {
            throw new RuntimeException("Livro não encontrado");
        }

        repository.deleteById(id);
    }
}