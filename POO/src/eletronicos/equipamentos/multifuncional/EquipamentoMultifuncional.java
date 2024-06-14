package eletronicos.equipamentos.multifuncional;

import eletronicos.equipamentos.copiadora.Copiadora;
import eletronicos.equipamentos.digitalizadora.Digitalizadora;
import eletronicos.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional.");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional.");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional.");
    }
}
