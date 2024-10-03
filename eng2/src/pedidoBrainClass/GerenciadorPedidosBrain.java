package pedidoBrainClass;

import pedido.Item;
import pedido.Pedido;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorPedidosBrain {
    private List<Pedido> pedidos;
    private double total;

    public GerenciadorPedidosBrain() {
        pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void adicionarItemAoPedido(Pedido pedido, Item item) {
        pedido.adicionarItem(item);
    }

    public void processarPedidos() {
        for (Pedido pedido : pedidos) {
            if (!pedido.isPreparado()) {
                System.out.println("Preparando o pedido para " + pedido.getCliente().getNome());
                pedido.setPreparado(true);
                for (Item item : pedido.getItens()) {
                    total += item.getPreco();
                }
                //teria a logica de verificar se o pagamento é valido também
                System.out.println("Total do pedido: " + total);
                System.out.println("Processando pagamento de " + total + " para o cliente " + pedido.getCliente().getNome());

                 if (pedido.isEntrega()) {
                    System.out.println("Organizando entrega para " + pedido.getCliente().getEndereco());
                } else {
                    System.out.println("Pedido pronto para retirada.");
                }

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
