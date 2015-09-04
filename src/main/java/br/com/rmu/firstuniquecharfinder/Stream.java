package br.com.rmu.firstuniquecharfinder;

/**
 * Define o meu Stream.
 */
public interface Stream {
    /**
     * Verifica se existe um próximo caracter a ser lido no Stream sem alterar a posição de leitura do stream.
     * @return <code>true</code> Se existir algo a ser lido.
     */
    public boolean hasNext();

    /**
     * Retorna o próximo caracter a ser lido no stream.
     * @return O próximo caracter da stream
     */
    public char getNext();
}