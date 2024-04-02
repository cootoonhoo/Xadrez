package domain.entities.pecas;

import domain.entities.Ponto;
import domain.enums.Cor;

import java.util.ArrayList;
import java.util.List;

public class Torre extends Peca {
    private boolean moveu; // Para fazer o roque

    public Torre(Cor cor) {
        super(cor);
        this.moveu = false;
    }

    @Override
    public List<List<Ponto>> getPossivelPosicoes(Ponto posInicial) {
        List<List<Ponto>> possiveisPosicoes = new ArrayList<>();

        int[][] direcoes = {
                {-1, 0},
                {0, -1},           {0, 1},
                  {1, 0},
        };

        for (int[] direcao : direcoes) {
            List<Ponto> possiveisPosicoesDirecao = new ArrayList<>();
            int linha = posInicial.getX() + direcao[0];
            int coluna = posInicial.getY() + direcao[1];


            while (linha >= 0 && linha < 8 && coluna >= 0 && coluna < 8) {
                possiveisPosicoesDirecao.add(new Ponto(linha, coluna));
                linha += direcao[0];
                coluna += direcao[1];
            }

            possiveisPosicoes.add(possiveisPosicoesDirecao);
        }

        return possiveisPosicoes;
    }
}
