package menu.menuForSweetsBase;
import menu.MenuItem;

public class AddNewSweetToBase implements MenuItem {
    @Override
    public String name() {
        return "Додати нові солодощі";
    }

    @Override
    public void execute() {
        System.out.println("Додавання нових солодощів до бази даних.");
    }
}