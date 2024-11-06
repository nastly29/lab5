package menu;

import gift.Gift;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuGroup implements MenuItem {
    private String name;
    private boolean isMainMenu;
    private List<MenuItem> items = new ArrayList<>();

    public MenuGroup(String name) {
        this(name, false);
    }

    public MenuGroup(String name, boolean isMainMenu) {
        this.name = name;
        this.isMainMenu = isMainMenu;
    }

    public MenuGroup addItem(MenuItem item) {
        items.add(item);
        return this;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=====================================");
            System.out.println(name + ":");
            for (int i = 0; i < items.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, items.get(i).name());
            }
            System.out.println("=====================================");
            System.out.print("Ваш вибір (0 для виходу) -> ");
            int choice = scanner.nextInt();
            if (choice == 0) {
                if (isMainMenu) {
                    System.out.println("\nПрограму завершено.");
                }
                break;
            } else if (choice > 0 && choice <= items.size()) {
                items.get(choice - 1).execute();
            } else {
                System.out.println("Невірний вибір!");
            }
        }
    }
}
