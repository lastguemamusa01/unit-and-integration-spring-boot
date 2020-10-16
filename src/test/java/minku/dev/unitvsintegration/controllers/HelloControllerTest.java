package minku.dev.unitvsintegration.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void hello() {
        // Arrange
        HelloController controller = new HelloController();
        //Act
        String response = controller.hello("World");
        // Assert
        assertEquals("Hello, World", response);
    }
}