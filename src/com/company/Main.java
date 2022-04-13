package com.company;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Criando clientes.
        var c1 = new Cliente(1L, "Fulano", new BigDecimal("250"));
        var c2 = new Cliente(2L, "Beltrano", new BigDecimal("40"));

        //Criando produtos
        var p1 = new Produto(1L, "Feijao Marca X", new BigDecimal("7.99"), new BigDecimal("10"));
        var p2 = new Produto(2L, "Arroz Marca Y", new BigDecimal("25.00"), new BigDecimal("10"));
        //Criando os itens do pedido

        //Montando pedido
        Pedido ped1 = new Pedido();
        ped1.setNumero(1L);
        ped1.setCliente(c1); //Pedido 1 esta ASSOCIADO ao cliente 1
        ped1.setData(LocalDate.now());

        //Adicionado itens no pedido.
        ped1.adicionarItemPedido(new ItemPedido(p1, new BigDecimal(2)));
        ped1.adicionarItemPedido(new ItemPedido(p2, new BigDecimal(3)));


        System.out.println("Listando Pedido");
        System.out.println(ped1);


        //Vamos totalizar o pedido agora

        System.out.println("Total do Pedido - Funcional: " + ped1.getItens().stream().map(itemPedido -> itemPedido.getQtde().multiply(itemPedido.getItem().getPrecoVenda())).reduce(BigDecimal.ZERO,BigDecimal::add));
        System.out.println("Total do Pedido - Imperativo:  " + ped1.totalizarPedido());

        System.out.println(formatarValorMonetarioBLR(ped1.totalizarPedido()));

    }

    public static String formatarValorMonetarioBLR(BigDecimal num) {
        return NumberFormat.getCurrencyInstance(new Locale("pt", "BR" )).format(num);
    }
}
