package domain.entities.pecas;

import domain.entities.Ponto;
import domain.enums.Cor;

import java.util.List;

public abstract class Peca {
    private Cor cor;

    public Peca(Cor cor) {
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public List<List<Ponto>> getPossivelPosicoes(Ponto posInicial)
    {
        throw new UnsupportedOperationException("A funcao de posicoes possiveis não foi implementada!");
    }
}
