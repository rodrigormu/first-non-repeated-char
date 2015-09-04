package br.com.rmu.firstuniquecharfinder;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Classe que faz a busca pelo primeiro caracter que não se repete no stream.
 */
public class FirstUniqueCharFinder {

    /**
     * Busca e retorna o primeiro caractere que não se repete no <code>pTexto</code>
     *
     * @param pTexto - Texto sendo avaliado
     */
    public static char firstChar(Stream pTexto) {
        char primeiroSemRepeticao ='\u0000';
        Map<Character, Integer> lidos = new LinkedHashMap<>();

        while (pTexto.hasNext()) {
            Character caractereCorrente = pTexto.getNext();
            Integer count = lidos.get(caractereCorrente);
            if (count == null) {
                count = 0;
            }
            lidos.put(caractereCorrente, ++count);
        }

        Set<Map.Entry<Character, Integer>> entries = lidos.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() == 1) {
                primeiroSemRepeticao = entry.getKey();
                break;
            }
        }
        return primeiroSemRepeticao;
    }


}
