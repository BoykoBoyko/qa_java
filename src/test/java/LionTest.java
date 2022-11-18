import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionTest {
    static Feline feline;
    String sex;
    boolean hasName;

    public LionTest (Feline feline, String sex, boolean hasName) {
        LionTest.feline = feline;
        this.sex = sex;
        this.hasName = hasName;
    }

    @Parameterized.Parameters
    public static Object[][] getData(){
        return new Object[][] {
                {feline, "Самец", true},
                {feline, "Самка", false}
        };
    }

    @Test
    public void maleHasNameButFemaleHasNoName() throws Exception {
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", hasName, lion.doesHaveMane());
    }

}
