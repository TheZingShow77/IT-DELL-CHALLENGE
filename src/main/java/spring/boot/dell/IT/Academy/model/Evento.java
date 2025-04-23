package spring.boot.dell.IT.Academy.model;

public enum Evento {
    PITCH(6),
    BUGS(-4),
    BOA_TRACAO(3),
    INVESTIDOR_IRRITADO(-6),
    FAKE_NEWS(-8);

    private final int impacto;
    Evento(int impacto) { 
        this.impacto = impacto; }
    public int getImpacto() { 
        return impacto; }
}

