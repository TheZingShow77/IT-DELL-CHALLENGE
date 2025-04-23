package spring.boot.dell.IT.Academy.model;

public class Startup{
    private String nome;
    private String slogan;
    private int anoFundacao;
    private int pontos = 70;
    private boolean favorito = false;

    public Startup(final String nome, final String slogan, final int anoFundacao, final boolean favorito) {
        this.nome = nome;
        this.slogan = slogan;
        this.anoFundacao = anoFundacao;
        this.favorito = favorito;
    }
    public String getNome() {
        return nome;
    }

    public String getSlogan() {
        return slogan;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }
    public int getPontos() {
        return pontos;
    }

    public boolean favorito() {
        return favorito;
    }
}
