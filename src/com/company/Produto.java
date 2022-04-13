package com.company;

import java.math.BigDecimal;

public class Produto {
    private Long codigo;
    private String descricao;
    private BigDecimal precoVenda;
    private BigDecimal estoque;

    public Produto(Long codigo,String descricao, BigDecimal precoVenda, BigDecimal estoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoVenda = precoVenda;
        this.estoque = estoque;
    }

    public Produto() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    public BigDecimal getEstoque() {
        return estoque;
    }

    public void setEstoque(BigDecimal estoque) {
        this.estoque = estoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "\nProduto{" +
                "\ncodigo=" + codigo +
                "\n, descricao='" + descricao + '\'' +
                "\n, precoVenda=" + precoVenda +
                "\n, estoque=" + estoque +
                '}';
    }
}
