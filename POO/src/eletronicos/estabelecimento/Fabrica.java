package eletronicos.estabelecimento;

import eletronicos.equipamentos.copiadora.Copiadora;
import eletronicos.equipamentos.digitalizadora.Digitalizadora;
import eletronicos.equipamentos.digitalizadora.Scanner;
import eletronicos.equipamentos.impressora.Deskjet;
import eletronicos.equipamentos.impressora.Impressora;
import eletronicos.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Deskjet deskjet = new Deskjet();

        Scanner scanner = new Scanner();

        Impressora impressora = deskjet;
        Digitalizadora digitalizadora = scanner;
        Copiadora copiadora = em;


        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
