package pedido;

public class Cozinha implements CozinhaInterface{
    private String nome;

    public Cozinha(String nome) {
        this.nome = nome;
    }

    @Override
    public void preparar(Pedido pedido) {
        System.out.println("preparando seu pedido :"+ pedido.getCliente());
    }
}
