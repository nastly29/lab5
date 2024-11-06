package menu.menuForGift;

import menu.MenuItem;

public class RemoveSweetFromGift implements MenuItem {
    @Override
    public String name() {
        return "Видалити солодощі з подарунка";
    }

    @Override
    public void execute() {
        System.out.println("Видалення солодощів з подарунка.");
    }
}

