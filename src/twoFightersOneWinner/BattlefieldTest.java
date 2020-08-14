package twoFightersOneWinner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattlefieldTest {

    @Test
    void declareWinner() {
        assertEquals("Lew", BattleField.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew"));
        assertEquals("Harry", BattleField.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", BattleField.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", BattleField.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
        assertEquals("Harald", BattleField.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
        assertEquals("Harald", BattleField.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "HaraldBattlefield"));
    }
}