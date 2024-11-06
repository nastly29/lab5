package menu.menuForSweetsBase;
import menu.MenuItem;

public class DisplaySweetsBase implements MenuItem {
    @Override
    public String name() {
        return "Переглянути наявні солодощі";
    }

    @Override
    public void execute() {
        System.out.println("Перегляд наявних солодощів у базі даних.");
    }
}
