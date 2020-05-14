/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Command;

public class Main {

    public static void main(String[] args) {
        DeviceInterface device = new Lamp();

        try {
            device.setCommand("on", new TurnOnCommand());
            device.setCommand("off", new TurnOffCommand());
            device.setCommand("toggle", new ToggleCommand());

            System.out.println(device.execute("on"));
            System.out.println(device.execute("off"));
            System.out.println(device.execute("toggle"));
            System.out.println(device.execute("toggle"));
        } catch (Exception e) {
            System.out.printf("Caught exception: %s \n", e.getLocalizedMessage());
        }
    }
}
