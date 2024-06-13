package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionando lanche no balcão.");
    }

    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionando suco no balcão.");
    }

    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche() {
        System.out.println("Preparando lanche.");
    }

    private void prepararSuco() {
        System.out.println("Preparando suco.");
    }

    private void prepararCombo() {
        prepararLanche();
        prepararSuco();
    }

    public void selecionarIngredientesLanche() {
        System.out.println("Selecionando o pão, a salada, o ovo, a carne, o presunto e o queijo.");
    }

    private void selecionarIngredientesSuco() {
        System.out.println("Selecionando a fruta, o açúcar e a água.");
    }

    private void lavarIngredientes() {
        System.out.println("Lavando ingredientes.");
    }

    private void baterSucoLiquidificador() {
        System.out.println("Batendo o suco no liquidificador.");
    }

    public void fritarIngredientesLanche() {
        System.out.println("Fritando a carne e o ovo para o lanche.");
    }

    /* Cozinheiro não pode pedir para o atendente trocar o gás por alguma questão hierárquica.
    public void pedirParaTrocarGas(Atendente meuAmigo) {
        meuAmigo.trocarGas();
    }
    */

    // Default (significa que apenas outras classes no mesmo package podem ver).
     void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

     void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
