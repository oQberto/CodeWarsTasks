package smallestInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestIntegerFinderTest {

    @Test
    public void example1(){
        int expected = 11;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78,56,232,12,11,43});
        assertEquals(expected, actual);
    }

    @Test
    public void example2(){
        int expected = -33;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78,56,-2,12,8,-33});
        assertEquals(expected, actual);
    }

    @Test
    public void example3(){
        int expected = Integer.MIN_VALUE;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{0,Integer.MIN_VALUE,Integer.MAX_VALUE});
        assertEquals(expected, actual);
    }

    @Test
    public void example4() {
        int expected = 0;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{0, 0, 0, 0, 0, 1, 2, 3, 4});
        assertEquals(expected, actual);
    }

    @Test
    public void example5() {
        int expected = -1;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{-1, -1, -1, -1, -1});
        assertEquals(expected, actual);
    }
}