package pedido;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorPedidos {
    private List<Pedido> pedidos;
    private CozinhaInterface cozinha;
    private PagamentoInterface pagamento = new ControlePagamento();
    EntregaAbstracao entrega = new EntregaRapida();


    public GerenciadorPedidos() {
        pedidos = new ArrayList<Pedido>();
        cozinha = new Cozinha("Aplicativo de Pedidos");
    }
    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
    public void processarPedidos(){
        for (Pedido pedido : pedidos) {
            if(!pedido.isPreparado()){
                cozinha.preparar(pedido);
                pedido.setPreparado(true);
                try {
                    Thread.sleep(5000);
                    pagamento.processaPagamento(pedido);
                    entrega.procesarEntrega(pedido);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}