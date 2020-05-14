/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Command;

public interface DeviceInterface {
    String execute(String commandName);
    void setCommand(String commandName, CommandInterface command);
}
