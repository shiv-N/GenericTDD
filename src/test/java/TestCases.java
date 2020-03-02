import org.junit.Assert;
import org.junit.Test;

public class TestCases {
    @Test
    public void First_Position_TestCase() {
        MaxInteger maxInteger = new MaxInteger();
        int result = maxInteger.FindMaxNumber(40,20,15);
        Assert.assertEquals(40,result);
    }

    @Test
    public void Second_Position_TestCase() {
        MaxInteger maxInteger = new MaxInteger();
        int result = maxInteger.FindMaxNumber(10,20,15);
        Assert.assertEquals(20,result);
    }

    @Test
    public void Third_Position_TestCase() {
        MaxInteger maxInteger = new MaxInteger();
        int result = maxInteger.FindMaxNumber(40,20,75);
        Assert.assertEquals(75,result);
    }
}
