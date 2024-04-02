package domain.entities.pecas;

import domain.entities.Ponto;
import domain.enums.Cor;

import java.util.ArrayList;
import java.util.List;

public class Cavalo extends Peca{
    public Cavalo(Cor cor) {
        super(cor);
    }
    @Override
    public List<List<Ponto>> getPossivelPosicoes(Ponto posInicial) {
        List<List<Ponto>> possiveisPosicoes = new ArrayList<>();

        int[][] direcoes = {
                {-2, -1}, {-2, 1},
                {-1, -2}, {-1, 2},
                {1, -2}, {1, 2},
                {2, -1}, {2, 1}
        };

        for (int[] direcao : direcoes) {
            List<Ponto> possiveisPosicoesDirecao = new ArrayList<>();
            int linha = posInicial.getX() + direcao[0];
            int coluna = posInicial.getY() + direcao[1];

            if (linha >= 0 && linha < 8 && coluna >= 0 && coluna < 8) {
                possiveisPosicoesDirecao.add(new Ponto(linha, coluna));
            }

            possiveisPosicoes.add(possiveisPosicoesDirecao);
        }

        return possiveisPosicoes;
    }
}
