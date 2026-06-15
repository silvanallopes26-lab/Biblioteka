package Biblioteka.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "livros")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "nome", column = @Column(name = "titulo_nome"))
    })
    private Titulo titulo;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "nome", column = @Column(name = "autor_nome"))
    })
    private Autor autor;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "valor", column = @Column(name = "preco_valor"))
    })
    private Preco preco;

    @Column(length = 1000)
    private String imagem;

    public Livro() {
    }

    public Livro(
            Titulo titulo,
            Autor autor,
            Preco preco,
            String imagem) {

        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.imagem = imagem;
    }

    public Long getId() {
        return id;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Preco getPreco() {
        return preco;
    }

    public String getImagem() {
        return imagem;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setPreco(Preco preco) {
        this.preco = preco;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}