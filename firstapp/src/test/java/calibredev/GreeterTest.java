package calibredev;
/**
 * assertThat is used to check the specified value matches the expected value 
 * JUnit is a unit testing framework 
 */
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import org.junit.Test;

/**
 * Unit test for object greet  
 */
public class GreeterTest 
{
    private Greeter greet = new Greeter();

    /**
     * Test to see if the object greet contains the world 'Hello'
     */
    @Test
    public void greeterSaysHello(){
        assertThat(greet.sayHello(), containsString("Hello"));
    }
}
