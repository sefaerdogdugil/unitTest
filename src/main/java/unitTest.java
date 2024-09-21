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
        Assert.assertEquals(unitTest.addition(5, 5, 10), 20, "Addition check failed.");
    }

    @Test
    public void subtractionCheck() {
        Assert.assertEquals(unitTest.subtraction(30, 10, 5), 15, "Bölme işlemi başarısız.");
    }

    @Test
    public void multiplicationCheck() {
        Assert.assertEquals(unitTest.multiple(2, 50, 2), 200, "Çarpma Başarısız.");
    }

    @Test
    public void testMultiplicationWithLargeNumbers() {
        Assert.assertEquals(unitTest.multiple(10000, 10000, 10), 1000000000, "Büyük sayılarla çarpma işlemi başarısız.");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDivisionByZero() {
        unitTest.division(10, 0);  // Sıfıra bölme testinde IllegalArgumentException bekleniyor
    }

    @Test
    public void testDivisionWithNegativeNumbers() {
        Assert.assertEquals(unitTest.division(-10, 5), -2, "Negatif sayılarla bölme işlemi başarısız.");
    }
}
