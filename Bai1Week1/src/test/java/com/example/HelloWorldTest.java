package Bai1Week1.src.test.java.com.example;
import org.junit.jupiter.api.Test;
import Bai1Week1.src.main.java.com.example.HelloWorld;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    public void testGetMessage() {
        // Arrange
        HelloWorld helloWorld = new HelloWorld();
        
        // Act
        String message = helloWorld.getMessage();
        
        // Assert
        assertEquals("Hello, World!", message);
    }
}
