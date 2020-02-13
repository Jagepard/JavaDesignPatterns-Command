/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Command;

public class TurnOnCommand implements CommandInterface {
    public void execute() {
        System.out.print("The Light turns on \n");
    }
}
