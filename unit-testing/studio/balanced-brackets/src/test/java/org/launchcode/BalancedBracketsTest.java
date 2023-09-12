package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
      @Test
    public void bracketsWithLetters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[abcd]"));
      }

      @Test
    public void soloOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
      }
    @Test
    public void closingSoloBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void wordsOutsideBracket() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("abcd[xyz]"));
    }
    @Test
    public void beginningWithBracketThenWords() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]abcd"));
    }
}