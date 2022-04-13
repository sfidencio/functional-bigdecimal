package com.company;

import java.math.BigDecimal;

public class ItemPedido {
    private Produto item;
    private BigDecimal qtde;

    public ItemPedido(Produto item, BigDecimal qtde) {
        this.item = item;
        this.qtde = qtde;
    }

    public void setItem(Produto item) {
        this.item = item;
    }

    public BigDecimal getQtde() {
        return qtde;
    }

    public void setQtde(BigDecimal qtde) {
        this.qtde = qtde;
    }

    public Produto getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "\nItemPedido{" +
                "\nitem=" + item +
                "\n, qtde=" + qtde +
                '}';
    }
}
