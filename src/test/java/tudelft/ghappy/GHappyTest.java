package tudelft.ghappy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    private GHappy happy;

    @BeforeEach
    public void initialize() {
        happy = new GHappy();
    }

    @Test
    public void nullG() {
        //Assertions.assertFalse(happy.gHappy(""));
    }

    @ParameterizedTest(name= "str= {0}")
    @CsvSource({"gxxxx", "xxxxg", "xxgxx"})
    public void oneG(String str) {
        Assertions.assertFalse(happy.gHappy(str));
    }


    @ParameterizedTest(name= "str= {0}")
    @CsvSource({"ggxxxx", "xxggxx", "xxxxgg"})
    public void twoGsBeside(String str) {
        Assertions.assertTrue(happy.gHappy(str));
    }

    @ParameterizedTest(name= "str= {0}")
    @CsvSource({"gggxxxx", "xxxxggg", "xxggggxx"})
    public void threeOrAboveGsBeside(String str){
        Assertions.assertTrue(happy.gHappy(str));
    }

    @ParameterizedTest(name= "str= {0}")
    @CsvSource({"gxgxxx", "xxxgxg", "xxgxgxx"})
    public void twoGsNotBeside(String str){
        Assertions.assertFalse(happy.gHappy(str));
    }

    @ParameterizedTest(name= "str= {0}")
    @CsvSource({"ggxxgxx", "xxxxgxgg", "xxggxxgx"})
    public void threeOrAboveGsNotAllBeside(String str){
        Assertions.assertFalse(happy.gHappy(str));
    }
}
