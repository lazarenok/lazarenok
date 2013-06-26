package GoogleTest;

import junit.framework.Assert;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: C13T
 * Date: 10.06.13
 * Time: 19:14
 * To change this template use File | Settings | File Templates.
 */
public class SimpleTest {
    @Test
    public void FirstTest()
    {
      int num=1235;
      boolean isPrime=true;
        if (num % 2 == 0)
        { isPrime=false;
            Assert.assertTrue(isPrime);}
        else
            for(int i=3; i<num; i=i+2) {
                if (num % i == 0)
                {
                    isPrime=false;
                    break;
                }
            }
        Assert.assertTrue(isPrime);

    }
}
