package demo.parallel;

import org.junit.Assert;

public class ComplexTest {

    @org.junit.Test
    public void  subsruction() {
        Complex result = new Complex(7, 1).subsruction(new Complex(1, 2));
        Assert.assertEquals((int) result.getRe(), 6);
        Assert.assertEquals((int) result.getIm(), -1);
        if (result.getRe() == 6 && result.getIm() == -1) {
            System.out.println("successfully");
        }
        
    }

    @org.junit.Test
    public void correctDivision() {
        Complex result = new Complex(10, 2).division(new Complex(10, 2));
        Assert.assertEquals((int) result.getRe(), 0);
        Assert.assertEquals((int) result.getIm(), 0);
        if (result.getRe() == 0 && result.getIm() == 0) {
            System.out.println("successfully");
        } else {
            System.out.println("wrong");
        }

    }
    
    @org.junit.Test
    public void Tangent() {
        Complex result = new Complex(2,8).times(new Complex(2,1));
       Assert.assertEquals(result.getRe(), -4, 0.1);
        Assert.assertEquals(result.getIm(), 18, 0.1);
    }
}