package calibredev;

import org.joda.time.LocalTime;
/**
 * An application that returns the local time and "Hello World" message 
 */
public class HelloWorld 
{
    public static void main( String[] args )
    {
        LocalTime current = new LocalTime();
        System.out.println("The current local time is: " + current);

        Greeter greet = new Greeter();
        System.out.println(greet.sayHello());
    }
}
