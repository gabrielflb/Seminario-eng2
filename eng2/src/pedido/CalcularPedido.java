package pedido;

public class CalcularPedido implements CalculoPedidoInterface{
    @Override
    public double calcularTotal(Pedido pedido) {
        double total = 0.0;
        for (Item item : pedido.getItens()) {
            total += item.getPreco();
        }
        return total;
    }
}
