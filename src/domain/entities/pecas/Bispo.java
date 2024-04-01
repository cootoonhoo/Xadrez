package domain.entities.pecas;

import domain.entities.Ponto;
import domain.enums.Cor;

import java.util.List;

public class Bispo extends Peca{
    public Bispo(Cor cor) {
        super(cor);
    }

    @Override
    public List<List<Ponto>> getPossivelPosicoes(Ponto posInicial)
    {
        return  null;
    }
}
