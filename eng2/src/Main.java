import pedido.*;

public class Main {
    public static void main(String[] args) {
        GerenciadorPedidos loja1 = new GerenciadorPedidos();//cria loja
        // cria pedidos
        Pedido ped = new Pedido(new Cliente("Cara","rua b"), false, TiposPagamento.CREDITO);
        Pedido pedido1 = new Pedido(new Cliente("João", "Rua A, 123"), true, TiposPagamento.PIX);

        pedido1.adicionarItem(new Item("Hamburguer", 10));//adicona itens aos pedidos
        pedido1.adicionarItem(new Item("Batata Frita", 5));

        ped.adicionarItem(new Item("carne", 30));

        loja1.adicionarPedido(ped);//adiciona pedidos ao gerenciador
        loja1.adicionarPedido(pedido1);
        // Processa o pedido
        loja1.processarPedidos();

    }

}