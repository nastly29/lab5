package menu.menuForGift;
import menu.MenuItem;

public class FindSweetBySugarInGift implements MenuItem {
    @Override
    public String name() {
        return "Пошук солодощів за рівнем цукру";
    }

    @Override
    public void execute() {
        System.out.println("Пошук солодощів у подарунку за рівнем цукру.");
    }
}