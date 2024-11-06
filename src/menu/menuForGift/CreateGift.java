package menu.menuForGift;
import menu.MenuItem;

public class CreateGift implements MenuItem {
    @Override
    public String name() {
        return "Створити подарунок";
    }

    @Override
    public void execute() {
        System.out.println("Подарунок створено!");
    }
}
