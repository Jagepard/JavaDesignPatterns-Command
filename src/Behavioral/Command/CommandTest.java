package Behavioral.Command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CommandTest {
    private DeviceInterface device;

    @BeforeEach
    void setUp() {
        this.device = new Lamp();
        this.device.setCommand("on", new TurnOnCommand());
        this.device.setCommand("off", new TurnOffCommand());
        this.device.setCommand("toggle", new ToggleCommand());
    }

    @Test
    void execute() {
        assertEquals(this.device.execute("on"), "The Light turns on");
        assertEquals(this.device.execute("off"), "The Light turns off");
        assertEquals(this.device.execute("toggle"), "The Light turns on");
        assertEquals(this.device.execute("toggle"), "The Light turns off");
    }
}