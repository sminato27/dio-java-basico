package eletronicos.equipamentos.digitalizadora;

public class Scanner implements Digitalizadora {

    @Override
    public void digitalizar() {
        System.out.println("Escaneando Scanner.");
    }
}
