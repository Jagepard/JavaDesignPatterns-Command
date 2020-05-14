/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Command;

public class ToggleCommand implements CommandInterface{
    int toggle = 1;

    public String execute() {
        CommandInterface command = ((toggle % 2) == 1) ? new TurnOnCommand() : new TurnOffCommand();
        toggle++;
        return command.execute();
    }
}
