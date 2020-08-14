package shortestWord;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestWordTest {

    @Test
    void findShort() {
        assertEquals(3, ShortestWord.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, ShortestWord.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, ShortestWord.findShort("Wise men speak because they have something to say fools because they have to say something"));
        assertEquals(2, ShortestWord.findShort("Chop your own wood and it will warm you twice"));
        assertEquals(1, ShortestWord.findShort("Love is a friendship set to music"));
        assertEquals(2, ShortestWord.findShort("123 3654 84576945 34 34765 498504 405"));
    }
}