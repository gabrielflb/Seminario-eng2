package pedidoBrainClass;

import pedido.*;

public class App {
    public static void main(String[] args) {
        GerenciadorPedidosBrain loja1 = new GerenciadorPedidosBrain();
        // Cria um pedido
        Pedido ped = new Pedido(new Cliente("Cara","rua b"), false, TiposPagamento.CREDITO);
        Pedido pedido1 = new Pedido(new Cliente("João", "Rua A, 123"), true, TiposPagamento.PIX);

        loja1.adicionarPedido(ped);
        loja1.adicionarPedido(pedido1);

        loja1.adicionarItemAoPedido(ped, new Item("Hamburguer", 10) );
        loja1.adicionarItemAoPedido(pedido1, new Item("Batata Frita", 5));
        loja1.adicionarItemAoPedido(pedido1, new Item("carne", 30));

        // Processa o pedido
        loja1.processarPedidos();
    }
}
