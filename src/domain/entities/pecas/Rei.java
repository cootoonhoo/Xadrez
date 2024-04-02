package domain.entities.pecas;

import domain.entities.Ponto;
import domain.enums.Cor;

import java.util.ArrayList;
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
        List<List<Ponto>> possiveisPosicoes = new ArrayList<>();

        int[][] direcoes = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, -1},           {0, 1},
                {1, -1},  {1, 0},  {1, 1}
        };

        for (int[] direcao : direcoes) {
            List<Ponto> possiveisPosicoesDirecao = new ArrayList<>();
            int linha = posInicial.getX() + direcao[0];
            int coluna = posInicial.getY() + direcao[1];

            if (linha >= 0 && linha < 8 && coluna >= 0 && coluna < 8) {
                possiveisPosicoes.add( possiveisPosicoesDirecao);
            }
        }

        return possiveisPosicoes;
    }
}
