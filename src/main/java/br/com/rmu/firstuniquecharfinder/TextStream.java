package br.com.rmu.firstuniquecharfinder;

/**
 * Implementação do stream para textos.
 */
public class TextStream implements Stream {
    private int curIndex = -1;
    private final char[] conteudo;

    /**
     * Constrói o stream com o texto recebido.
     * @param pConteudo - O texto
     */
    public TextStream(String pConteudo) {
        this.conteudo = pConteudo.toCharArray();
    }

    public boolean hasNext() {
        return curIndex + 1 != conteudo.length;
    }

    public char getNext() {
        return conteudo[++curIndex];
    }
}
