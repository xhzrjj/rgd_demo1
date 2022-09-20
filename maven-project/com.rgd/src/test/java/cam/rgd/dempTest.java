package cam.rgd;

import com.rgd.demo;
import junit.framework.Assert;
import org.testng.annotations.Test;

public class dempTest {
    @Test
    public void testSay(){
        demo d=new demo();
        String ret =d.say("rgd");
        Assert.assertEquals("hellorgd",ret);
    }
}
