package ibge;

// Criação do enum ibge.EstadosBrasileiros para utilização em toda a aplicação.
public enum EstadosBrasileiros {
    SAO_PAULO ("SP", "São Paulo", 11),
    RIO_JANEIRO ("RJ", "Rio de Janeiro", 22),
    PIAUI ("PI", "Piauí", 33),
    MARANHAO ("MA", "Maranhão", 44),
    CEARA ("CE", "Ceará", 55);

    private String nome;
    private String sigla;
    private int ibge;

    private EstadosBrasileiros(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public int getIbge() {
        return ibge;
    }

    public void setIbge(int ibge) {
        this.ibge = ibge;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
