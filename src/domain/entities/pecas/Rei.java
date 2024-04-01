package domain.entities.pecas;

import domain.entities.Ponto;
import domain.enums.Cor;

import java.util.List;

public class Rei extends Peca{
    private boolean moveu; //Para o roque

    public Rei(Cor cor) {
        super(cor);
        this.moveu = false;
    }

    @Override
    public List<List<Ponto>> getPossivelPosicoes(Ponto posInicial)
    {
        return  null;
    }
}
