package Java.CodeWars.cw5;

import static org.junit.Assert.*;
import org.junit.Test;

public class Kata5Test {
    
    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", Kata5.rps("rock", "scissors"));
        assertEquals("Player 1 won!", Kata5.rps("scissors", "paper"));
        assertEquals("Player 1 won!", Kata5.rps("paper", "rock"));
    }
    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", Kata5.rps("scissors", "rock"));
        assertEquals("Player 2 won!", Kata5.rps("paper", "scissors"));
        assertEquals("Player 2 won!", Kata5.rps("rock", "paper"));
    }
    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", Kata5.rps("scissors", "scissors"));
        assertEquals("Draw!", Kata5.rps("paper", "paper"));
        assertEquals("Draw!", Kata5.rps("rock", "rock"));
    }
    
}