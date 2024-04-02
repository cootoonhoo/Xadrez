package domain.entities.pecas;

import domain.entities.Ponto;
import domain.enums.Cor;

import java.util.ArrayList;
import java.util.List;

public class Peao extends Peca{
    private boolean moveu;
    public Peao(Cor cor) {
        super(cor);
        this.moveu = false;
    }
    @Override
    public List<List<Ponto>> getPossivelPosicoes(Ponto posInicial) {
        boolean corBranca;

        corBranca = this.getCor() == Cor.BRANCO;
        List<List<Ponto>> possiveisPosicoes = new ArrayList<>();

        List<Ponto> possiveisPosicoesFrente = new ArrayList<>();
        int direcaoFrente = corBranca ? -1 : 1; // Define a direção do avanço do peão
        int linhaFrente1 = posInicial.getX() + direcaoFrente;
        int linhaFrente2 = posInicial.getX() + (2 * direcaoFrente); // Para avanço inicial de duas casas


        if ((corBranca && posInicial.getX() == 6) || (!corBranca && posInicial.getX() == 1)) {
            possiveisPosicoesFrente.add(new Ponto(linhaFrente2, posInicial.getY()));
        }

        if (linhaFrente1 >= 0 && linhaFrente1 < 8) {
            possiveisPosicoesFrente.add(new Ponto(linhaFrente1, posInicial.getY()));
        }

        possiveisPosicoes.add(possiveisPosicoesFrente);

        List<Ponto> possiveisPosicoesDiagonais = new ArrayList<>();
        possiveisPosicoesDiagonais.add(new Ponto(linhaFrente1, posInicial.getY() - 1)); // Esquerda
        possiveisPosicoesDiagonais.add(new Ponto(linhaFrente1, posInicial.getY() + 1)); // Direita

        possiveisPosicoes.add(possiveisPosicoesDiagonais);

        return possiveisPosicoes;
    }


}
