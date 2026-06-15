package Biblioteka.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import Biblioteka.entity.Usuario;
import Biblioteka.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "http://localhost:5173")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario) {
        return service.salvar(usuario);
    }

    @GetMapping
    public List<Usuario> listar() {
        return service.listar();
    }
}