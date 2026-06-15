package Biblioteka.config;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Biblioteka.entity.Autor;
import Biblioteka.entity.Livro;
import Biblioteka.entity.Preco;
import Biblioteka.entity.Titulo;
import Biblioteka.repository.LivroRepository;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner carregarLivros(LivroRepository repository) {

        return args -> {

            // Evita inserir livros duplicados
            if (repository.count() > 0) {
                return;
            }

            repository.save(new Livro(
                    new Titulo("Java Completo"),
                    new Autor("João Silva"),
                    new Preco(new BigDecimal("89.90")),
                    "/imagens/Java.jpg"));

            repository.save(new Livro(
                    new Titulo("Spring Boot na Prática"),
                    new Autor("Maria Oliveira"),
                    new Preco(new BigDecimal("99.90")),
                    "/imagens/Spring.jpg"));

            repository.save(new Livro(
                    new Titulo("React para Iniciantes"),
                    new Autor("Carlos Souza"),
                    new Preco(new BigDecimal("79.90")),
                    "/imagens/Iniciantes.jpg"));

            repository.save(new Livro(
                    new Titulo("Banco de Dados MySQL"),
                    new Autor("Fernanda Lima"),
                    new Preco(new BigDecimal("69.90")),
                    "/imagens/Banco.jpg"));

            repository.save(new Livro(
                    new Titulo("Arquitetura de Software"),
                    new Autor("Ricardo Mendes"),
                    new Preco(new BigDecimal("119.90")),
                    "/imagens/Arquitetura.jpg"));

            repository.save(new Livro(
                    new Titulo("Clean Code"),
                    new Autor("Robert C. Martin"),
                    new Preco(new BigDecimal("129.90")),
                    "/imagens/Clean.jpg"));

            repository.save(new Livro(
                    new Titulo("Programação Orientada a Objetos"),
                    new Autor("Gustavo Ferreira"),
                    new Preco(new BigDecimal("74.90")),
                    "/imagens/Orientada.jpg"));

            repository.save(new Livro(
                    new Titulo("Desenvolvimento Web Moderno"),
                    new Autor("Ana Paula Rocha"),
                    new Preco(new BigDecimal("94.90")),
                    "/imagens/Web.jpg"));

            repository.save(new Livro(
                    new Titulo("APIs REST com Spring"),
                    new Autor("Eduardo Santos"),
                    new Preco(new BigDecimal("84.90")),
                    "/imagens/APIs.jpg"));

            repository.save(new Livro(
                    new Titulo("JavaScript Avançado"),
                    new Autor("Lucas Almeida"),
                    new Preco(new BigDecimal("89.90")),
                    "/imagens/JavaScript.jpg"));

            repository.save(new Livro(
                    new Titulo("Python para Iniciantes"),
                    new Autor("Marcos Costa"),
                    new Preco(new BigDecimal("79.90")),
                    "/imagens/Python.jpg"));

            repository.save(new Livro(
                    new Titulo("Inteligência Artificial"),
                    new Autor("Paulo Mendes"),
                    new Preco(new BigDecimal("139.90")),
                    "/imagens/Inteligencia.jpg"));

            repository.save(new Livro(
                    new Titulo("Algoritmos e Lógica"),
                    new Autor("Ricardo Souza"),
                    new Preco(new BigDecimal("69.90")),
                    "/imagens/Algoritmos.jpg"));

            repository.save(new Livro(
                    new Titulo("Engenharia de Software"),
                    new Autor("Camila Alves"),
                    new Preco(new BigDecimal("119.90")),
                    "/imagens/Software.jpg"));

            repository.save(new Livro(
                    new Titulo("Docker Essencial"),
                    new Autor("André Lima"),
                    new Preco(new BigDecimal("89.90")),
                    "/imagens/Docker.jpg"));

            repository.save(new Livro(
                    new Titulo("Kubernetes na Prática"),
                    new Autor("Lucas Rocha"),
                    new Preco(new BigDecimal("149.90")),
                    "/imagens/Kubernetes.jpg"));

            repository.save(new Livro(
                    new Titulo("Git e GitHub"),
                    new Autor("Fernando Silva"),
                    new Preco(new BigDecimal("59.90")),
                    "/imagens/GitHub.jpg"));

            repository.save(new Livro(
                    new Titulo("TypeScript Moderno"),
                    new Autor("Amanda Costa"),
                    new Preco(new BigDecimal("99.90")),
                    "/imagens/moderno.jpg"));

            repository.save(new Livro(
                    new Titulo("Node.js Completo"),
                    new Autor("Carlos Henrique"),
                    new Preco(new BigDecimal("109.90")),
                    "/imagens/Node.js.jpg"));

            repository.save(new Livro(
                    new Titulo("React Avançado"),
                    new Autor("Patrícia Gomes"),
                    new Preco(new BigDecimal("119.90")),
                    "/imagens/React-Avancado.jpg"));
        };
    }
}