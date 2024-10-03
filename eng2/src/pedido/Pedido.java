package pedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private boolean preparado;
    private boolean entrega;
    private Cliente cliente;
    private List<Item> itens;
    private CalculoPedidoInterface calcularPedido;
    private TiposPagamento tipoPagamento;

    public Pedido(Cliente cliente, boolean entrega, TiposPagamento tipoPagamento) {
        this.preparado = false;
        this.entrega = entrega;
        this.cliente = cliente;
        this.itens = new ArrayList<Item>();
        this.tipoPagamento = tipoPagamento;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }
    public void removerItem(Item item) {
        itens.remove(item);
    }

    public double verificarValorPedido(){
        calcularPedido = new CalcularPedido();
        System.out.println("Total pedido:" + calcularPedido.calcularTotal(this));
        return calcularPedido.calcularTotal(this);
    }

    public boolean isPreparado() {
        return preparado;
    }

    public void setPreparado(boolean preparado) {
        this.preparado = preparado;
    }

    public boolean isEntrega() {
        return entrega;
    }



    public Cliente getCliente() {
        return cliente;
    }


    public List<Item> getItens() {
        return itens;
    }


    public TiposPagamento getTipoPagamento() {
        return tipoPagamento;
    }
}
