package menu.menuForSweetsBase;
import menu.MenuItem;

public class DeleteSweetFromBase implements MenuItem {
    @Override
    public String name() {
        return "Видалити солодощі";
    }

    @Override
    public void execute() {
        System.out.println("Видалення солодощів з бази даних.");
    }
}