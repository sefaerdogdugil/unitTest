import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class unitTest {

    private exampleFunction unitTest;

    @BeforeMethod
    public void setUp() {
        unitTest = new exampleFunction();

    }
    @Test
    public void additionCheck() {
        Assert.assertEquals(20, unitTest.addition(5,5,10),"False");
    }
}
