package br.com.rmu.firstuniquecharfinder;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class FirstUniqueCharFinderTest {
    /**
     * Teste para garantir que o método diferencia caracteres maiúsculos e minusculos.
     * O texto possui o J duas vezes, uma maiúscula e outra minúsculo.
     */
    @Test
    public void testDeveDiferenciarCaracteresMaiusculosMinusculos() {
        Character unique = FirstUniqueCharFinder.firstChar(new TextStream("LLkkJjFFrr"));
        assertTrue("Deveria retornar 'J", unique.equals(Character.valueOf('J')));
    }

    /**
     * Teste que garante que o método sabe lidar com o fato de não encontrar nenhum caractere único. Retorno deve ser
     * '\u0000' (NULL)
     */
    @Test
    public void testComTextoNaoPossuiCaractereQueNaoSeRepete() {
        Character unique = FirstUniqueCharFinder.firstChar(new TextStream("AASSDD"));
        assertTrue("Deveria retornar null.", unique.equals(Character.valueOf('\u0000')));
    }

    /**
     * Testando quando o caractere único é o primeiro do stream.
     */
    @Test
    public void testComTextoComCaractereUnicoSendoOPrimeiro() {
        Character unique = FirstUniqueCharFinder.firstChar(new TextStream("aSSDDFFGGHHJJMMNNBBVV"));
        assertTrue("Deveria retornar 'a'", unique.equals(Character.valueOf('a')));
    }
    /**
     * Testando quando o caractere único é o último do stream..
     */
    @Test
    public void testComTextoComCaractereUnicoSendoOUltimo() {
        Character unique = FirstUniqueCharFinder.firstChar(new TextStream("AASSDDFFGGHHJJMMNNBBv"));
        assertTrue("Deveria retornar 'v'", unique.equals(Character.valueOf('v')));
    }

    /**
     * Teste que garante o tratamento de Stream null. Retorno deve ser '\u0000' (NULL)
     */
    @Test
    public void testPassandoStreamNull() {
        Character unique = FirstUniqueCharFinder.firstChar(null);
        assertTrue("Deveria retornar null", unique.equals(Character.valueOf('\u0000')));
    }
    /**
     * Teste que garante o tratamento de Stream null. Retorno deve ser '\u0000' (NULL)
     */
    @Test
    public void testPassandoStreamVazio() {
        Character unique = FirstUniqueCharFinder.firstChar(new TextStream(""));
        assertTrue("Deveria retornar null", unique.equals(Character.valueOf('\u0000')));
    }

    /**
     * Testa o método lidando com texto longo.
     */
    @Test
    public void testComTextoLongo() {
        Character unique = FirstUniqueCharFinder.firstChar(new TextStream("AABBCCDDEEFFGGHHIIJJKKLLMMNNOOPPQQRRSSTTUUVVXZZ11223344556677889900aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvxxzzAABBCCDDEEFFGGHHIIJJKKLLMMNNOOPPQQRRSSTTUUVVZZ11223344556677889900aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvxxzzAABBCCDDEEFFGGHHIIJJKKLLMMNNOOPPQQRRSSTTUUVVZZ11223344556677889900aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvxxzzAABBCCDDEEFFGGHHIIJJKKLLMMNNOOPPQQRRSSTTUUVVZZ11223344556677889900aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvxxzz"));
        assertTrue("Deveria retornar X", unique.equals(Character.valueOf('X')));
    }
    /**
     * Testa o método lidando com texto composto por caracteres especiais.
     */
    @Test
    public void testComTextoCaracteresEspeciais() {
        Character unique = FirstUniqueCharFinder.firstChar(new TextStream("!!@##$$%%^^&**(())__--==++``~~\"\"''"));
        assertTrue("Deveria retornar @", unique.equals(Character.valueOf('@')));
    }
}