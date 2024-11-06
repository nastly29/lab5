package menu.menuForGift;

import menu.MenuItem;

public class AddSweetToGift implements MenuItem {
    @Override
    public String name() {
        return "Додати солодощі до подарунка";
    }

    @Override
    public void execute() {
        System.out.println("Додавання солодощів до подарунка.");
    }
}

