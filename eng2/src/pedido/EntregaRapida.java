package pedido;

public class EntregaRapida implements EntregaAbstracao{

    @Override
    public void procesarEntrega(Pedido pedido) {
        if (pedido.isEntrega()) {
            System.out.println("Organizando entrega para " + pedido.getCliente().getEndereco());
        } else {
            System.out.println("Pedido pronto para retirada.");
        }
    }
}

