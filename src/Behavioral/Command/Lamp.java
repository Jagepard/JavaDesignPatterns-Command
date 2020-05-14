/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Command;

import java.util.LinkedHashMap;

public class Lamp implements DeviceInterface{

    LinkedHashMap<String, CommandInterface> commands = new LinkedHashMap<>();

    public String execute(String commandName) {
        if (!commands.containsKey(commandName)) {
            throw new IllegalArgumentException("Command does not exist in the registry");
        }

        return commands.get(commandName).execute();
    }

    public void setCommand(String commandName, CommandInterface command) {
        if (commands.containsKey(commandName)) {
            throw new IllegalArgumentException("Command already exists");
        }

        commands.put(commandName, command);
    }
}
