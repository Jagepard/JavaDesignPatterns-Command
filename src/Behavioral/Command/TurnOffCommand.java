/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Command;

public class TurnOffCommand implements CommandInterface{
    public void execute() {
        System.out.print("The Light turns off \n");
    }
}
