package domain.entities.pecas;

import domain.entities.Ponto;
import domain.enums.Cor;

import java.util.List;

public class Rainha extends Peca{

    public Rainha(Cor cor) {
        super(cor);
    }

    @Override
    public List<List<Ponto>> getPossivelPosicoes(Ponto posInicial)
    {
        return  null;
    }
}
