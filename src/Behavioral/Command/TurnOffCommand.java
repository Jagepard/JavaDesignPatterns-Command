/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Command;

public class TurnOffCommand implements CommandInterface{
    public String execute() {
        return "The Light turns off";
    }
}
