package runner;

import org.testng.annotations.Test;

public class MyTestingToolsMain {

    @Test
    public void demoRun() {
        System.out.println("Demo! Thread: " + Thread.currentThread().getId());
    }
}
