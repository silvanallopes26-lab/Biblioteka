package Biblioteka.entity;

import java.math.BigDecimal;

import jakarta.persistence.Embeddable;

@Embeddable
public class Preco {

    private BigDecimal valor;

    public Preco() {
    }

    public Preco(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}