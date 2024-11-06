package menu.menuForGift;
import menu.MenuItem;

public class SortSweetByNameInGift implements MenuItem {
    @Override
    public String name() {
        return "Сортувати солодощі в подарунку за назвою";
    }

    @Override
    public void execute() {
        System.out.println("Сортування солодощів в подарунку за іменем.");
    }
}
