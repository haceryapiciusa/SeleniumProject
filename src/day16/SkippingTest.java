package day16;


import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippingTest {

    @Test
    public void thisTestMightBeSkipped(){
//        boolean condition = new Random().nextBoolean();
        boolean condition = true;
        if(condition){
            throw new SkipException("This is test is skipped because of some condition");
        }
        // Testing instructions
    }

    @Test
    public void thisTestWillNotBeSkipped(){
        // Testing instructions

    }

    @Test
    public void thisTestWillFail(){
        Assert.fail(  );
    }

    @Test(enabled = false)
    public void thisTestWillNotBeRun(){
        Assert.fail(  );
    }
}