package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        /* Ações que não precisam estarem disponíveis para toda a aplicação.
        cozinheiro.lavarIngredientes();
        cozinheiro.baterSucoLiquidificador();
        cozinheiro.selecionarIngredientesSuco();
        cozinheiro.prepararLanche();
        cozinheiro.prepararSuco();
        cozinheiro.prepararCombo();
        */

        // Ações que estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();;
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Almoxarife almoxarife = new Almoxarife();
        // ações que não precisam estarem disponíveis para toda a aplicação
        // almoxarife.controlarEntrada();
        // almoxarife.controlarSaida();
        // ação que somente o seu pacote cozinha precisa conhecer (default)
        // almoxarife.entregarIngredientes();
        // almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        // atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();
        // Ação que somente o seu pacote cozinha precisa conhecer (default)
        // atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        // Atendente já realiza essa ação.
        // cliente.pegarPedidoBalcao();

        // Esta ação é muito sigilosa.
        // cliente.consultarSaldoAplicativo();

        /* Estabelecimento não precisa visualizar essas ações
        cozinheiro.pedirParaTrocarGas(atendente);
        cozinheiro.pedirParaTrocarGas(almoxarife);
        */
    }
}