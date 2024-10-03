package pedido;

import java.util.ArrayList;
import java.util.List;

public class ControlePagamento implements PagamentoInterface {

    @Override
    public void processaPagamento(Pedido p){
        System.out.println("Processando pagamento de :" + p.verificarValorPedido() + " para o cliente " + p.getCliente().getNome() +"! Tipo de pagamento: "+ p.getTipoPagamento());

    }
}
