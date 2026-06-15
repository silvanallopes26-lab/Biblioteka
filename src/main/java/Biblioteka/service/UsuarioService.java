package Biblioteka.service;

import java.util.List;

import org.springframework.stereotype.Service;

import Biblioteka.entity.Usuario;
import Biblioteka.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }

    public List<Usuario> listar() {
        return repository.findAll();
    }
}