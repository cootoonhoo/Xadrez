package domain.entities.pecas;

import domain.entities.Ponto;
import domain.enums.Cor;

import java.util.List;

public class Torre extends Peca {
    private boolean moveu; // Para fazer o roque

    public Torre(Cor cor) {
        super(cor);
        this.moveu = false;
    }

    @Override
    public List<List<Ponto>> getPossivelPosicoes(Ponto posInicial)
    {
        return  null;
    }
}
