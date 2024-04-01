package domain.entities;

public class Casa {
    private Ponto posicao;
    private boolean atacadoBranco;
    private boolean atacadoPreto;

    public Casa(Ponto ponto, boolean atacadoBranco, boolean atacadoPreto) {
        this.posicao = ponto;
        this.atacadoBranco = atacadoBranco;
        this.atacadoPreto = atacadoPreto;
    }

    public Ponto getPosicao() {
        return posicao;
    }

    public boolean isAtacadoBranco() {
        return atacadoBranco;
    }

    public boolean isAtacadoPreto() {
        return atacadoPreto;
    }
}
