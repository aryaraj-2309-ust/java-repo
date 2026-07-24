package hello;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class AppTest {

    @Test
    public void testAppHasAGreeting() {
        App app = new App();
        assertTrue("App should have a greeting", app.getGreeting() != null);
    }

    @Test
    public void testGreetingIsHelloWorld() {
        App app = new App();
        assertTrue("Greeting should be 'Hello world!'", app.getGreeting().equals("Hello world!"));
    }
}
