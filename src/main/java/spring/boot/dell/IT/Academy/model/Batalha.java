package spring.boot.dell.IT.Academy.model;

public class Batalha {
    private Startup a;
    private Startup b;
    private Startup vencedor;
    private boolean

    public Batalha(Startup a, Startup b) {
        this.a = a;
        this.b = b;
    }
    public Startup getA() {
        return a;
    }
    public Startup getB() {
        return b;
    }       

    public Startup getVencedor() {
        return vencedor;
    }
    
}
