package cn.itsource.test;

import cn.itsource.Hello;
import org.junit.Test;

public class HelloTest {

    @Test
    public void testHello() throws Exception{
        Hello hello = new Hello();
        hello.showMessage();
    }
}
