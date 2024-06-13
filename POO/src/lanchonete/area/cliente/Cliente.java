package lanchonete.area.cliente;

public class Cliente {
    public void escolherLanche() {
        System.out.println("Escolhendo o lanche.");
    }
    public void fazerPedido() {
        System.out.println("Fazendo o pedido.");
    }
    public void pagarConta() {
        consultarSaldoAplicativo();
        System.out.println("Pagando a conta.");
    }
    private void consultarSaldoAplicativo() {
        System.out.println("Consultando saldo no app.");
    }
    /* O atendente já pega o pedido no balcão, então o cliente não precisa fazer o mesmo.
    void pegarPedidoBalcao() {
        System.out.println("Pegando o pedido no balcão.");
    }
    */
}