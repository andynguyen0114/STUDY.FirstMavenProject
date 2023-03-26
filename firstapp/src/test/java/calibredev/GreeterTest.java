package calibredev;
/**
 * JUnit is a unit testing framework 
 * assertThat is used to check the specified value matches the expected value 
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
     * Test to see if the object greet contains the word 'Hello'
     */
    @Test
    public void greeterSaysHello(){
        assertThat(greet.sayHello(), containsString("Hello"));
    }
}
