package br.com.rmu.firstuniquecharfinder;

import org.junit.Assert;
import org.junit.Test;

public class FirstUniqueCharFinderTest {
    @Test
    public void test_with_short_string() {
        Character retval = FirstUniqueCharFinder.firstChar(new TextStream("aAbBABac"));
        Assert.assertTrue("expected = b but got " + retval, retval.equals(Character.valueOf('b')));
    }

    @Test
    public void test_with_longer_string() {
        Character retval = FirstUniqueCharFinder.firstChar(new TextStream("bcdefghijklmnopqrstuvwxyzbcdefghijklmnopqrstuvwxyzbcadefghijklmnopqrstuvwxyzbcdefghijklmnopqrstuvwxyzbcdefghijklmnopqrstuvwxyzbcdefghijklmnopqrstuvwxyzbcdefghijklmnopqrstuvwxyzbcdefghijklmnopqrstuvwxyzbcdefghijklmnopqrstuvwxyzbcdefghijklmnopqrstuvwxyz"));
        Assert.assertTrue("expected = a but got " + retval, retval.equals(Character.valueOf('a')));
    }

    @Test
    public void test_with_unique_char_as_first() {
        Character retval = FirstUniqueCharFinder.firstChar(new TextStream("baABABac"));
        Assert.assertTrue("expected = b but got " + retval, retval.equals(Character.valueOf('b')));
    }

    @Test
    public void test_with_unique_char_as_last() {
        Character retval = FirstUniqueCharFinder.firstChar(new TextStream("aABABac"));
        Assert.assertTrue("expected = c but got " + retval, retval.equals(Character.valueOf('c')));
    }

    @Test
    public void test_no_unique_found() {
        Character retval = FirstUniqueCharFinder.firstChar(new TextStream("aaAAbbBBccCC"));
        Assert.assertTrue("expected = null but got " + retval, retval.equals(Character.valueOf('\u0000')));
    }
}
