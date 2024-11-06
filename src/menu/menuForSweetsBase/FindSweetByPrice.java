package menu.menuForSweetsBase;
import menu.MenuItem;

public class FindSweetByPrice implements MenuItem {
    @Override
    public String name() {
        return "Пошук солодощів за ціною";
    }

    @Override
    public void execute() {
        System.out.println("Пошук солодощів у базі даних за ціною.");
    }
}

