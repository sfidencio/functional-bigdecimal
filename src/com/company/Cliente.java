package com.company;

import java.math.BigDecimal;

public class Cliente {
    private Long codigo;
    private String nome;
    private BigDecimal limiteCredito;

    public Cliente(Long codigo, String nome, BigDecimal limiteCredito) {
        this.codigo = codigo;
        this.nome = nome;
        this.limiteCredito = limiteCredito;
    }
    public Cliente() {
    }
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(BigDecimal limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public String toString() {
        return "\nCliente{" +
                "\ncodigo=" + codigo +
                "\n, nome='" + nome + '\'' +
                "\n, limiteCredito=" + limiteCredito +
                '}';
    }
}
