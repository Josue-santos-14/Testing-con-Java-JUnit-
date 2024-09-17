import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FizzBuzzTest {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    private FizzBuzz game;

    @Before
    public void before() {
        game = new FizzBuzz();
    }

    @Test
    public void should_returnNumbers_whenNotAMultiple0f30r5() {
        List<String> numberList = game.getNumbers();
        Assert.assertEquals("1", numberList.get(0));
        Assert.assertEquals("2", numberList.get(1));
        Assert.assertEquals("7", numberList.get(6));
        Assert.assertEquals("13", numberList.get(12));
    }

    @Test
    public void should_returnFizz_whenNotAMultiple0f3() {
        List<String> numberList = game.getNumbers();
        Assert.assertEquals(FIZZ, numberList.get(2));
        Assert.assertEquals(FIZZ, numberList.get(5));
        Assert.assertEquals(FIZZ, numberList.get(8));
        Assert.assertEquals(FIZZ, numberList.get(11));

    }

    @Test
    public void should_returnFizz_whenNotAMultiple0f5() {
        List<String> numberList = game.getNumbers();
        Assert.assertEquals(BUZZ, numberList.get(4));
        Assert.assertEquals(BUZZ, numberList.get(9));
        Assert.assertEquals(BUZZ, numberList.get(19));
        Assert.assertEquals(BUZZ, numberList.get(24));
    }

    @Test
    public void should_returnFizz_whenNotAMultiple0f3And5() {
        List<String> numberList = game.getNumbers();
        Assert.assertEquals(FIZZ + BUZZ, numberList.get(14));
        Assert.assertEquals(FIZZ + BUZZ, numberList.get(29));
        Assert.assertEquals(FIZZ + BUZZ, numberList.get(59));
        Assert.assertEquals(FIZZ + BUZZ, numberList.get(89));
    }


}