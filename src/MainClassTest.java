import org.junit.Assert;
import org.junit.Test;

public class MainClassTest
{
    MainClass object = new MainClass();


    @Test
    public void testGetLocalNumber()
    {
        int actual = object.getLocalNumber();
        int expected = 14;
        Assert.assertTrue("Sorry getLocalNumber returns a value not equal to 14",actual == expected);
    }

     @Test
    public void testGetClassNumber()
    {
        int actual = object.getClassNumber();
        int expected = 45;
        Assert.assertTrue("Sorry getClassNumber returns a value less than 45 ",actual > expected);
    }


}