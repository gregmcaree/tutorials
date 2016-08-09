package uk.co.gm.traditional;

import static org.junit.Assert.assertEquals;

public class MyTester {
    @org.junit.Test
    public void sayHello() throws Exception {

        MyTest myTest = new MyTest();
        String result = myTest.sayHello("Pretty");
        assertEquals(result, "Hello Pretty");
    }
}
