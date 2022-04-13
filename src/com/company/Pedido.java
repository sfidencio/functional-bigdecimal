package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.time.LocalDate;

public class Pedido {
    private Long numero;
    private LocalDate data;
    private Cliente cliente;
    private List<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList<>(0);
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void adicionarItemPedido(ItemPedido p) {
        this.itens.add(p);
    }

    public void removerItemPedido(ItemPedido p) {
        this.itens.remove(p);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "\nnumero=" + numero +
                "\n, data=" + data +
                "\n, cliente=" + cliente +
                "\n, itens=" + itens +
                '}';
    }

    public BigDecimal totalizarPedido() {
        BigDecimal subtotal = new BigDecimal(0);
        for (ItemPedido item : getItens())
           subtotal = subtotal.add(item.getQtde().multiply(item.getItem().getPrecoVenda()));
        return subtotal;
    }
}
