package menu.menuForGift;

import menu.MenuItem;

public class DisplayGiftInfo implements MenuItem {
    @Override
    public String name() {
        return "Відобразити інформацію про подарунок";
    }

    @Override
    public void execute() {
        System.out.println("Відображення інформації про подарунок.");
    }
}