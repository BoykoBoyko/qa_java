import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void listOfMeatIsCorrect() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, feline.eatMeat());
    }

    @Test
    public void belongsToFelineFamily() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void returnedCorrectFixNumberOfKittens() {
        int expectedNumber = feline.getKittens();
        int actualNumber = 1;
        Assert.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void returnedCorrectAnyNumberOfKittens() {
        int expected = 9;
        int actual = feline.getKittens(9);
        Assert.assertEquals(expected, actual);
    }


}
