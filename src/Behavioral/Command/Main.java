/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Command;

public class Main {

    public static void main(String[] args) {
        Lamp device = new Lamp();

        try {
            device.setCommand("on", new TurnOnCommand());
            device.setCommand("off", new TurnOffCommand());
            device.setCommand("toggle", new ToggleCommand());
            device.execute("on");
            device.execute("off");
            device.execute("toggle");
            device.execute("toggle");
        } catch (Exception e) {
            System.out.printf("Caught exception: %s \n", e.getLocalizedMessage());
        }
    }
}
