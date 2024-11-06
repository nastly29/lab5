package gift;

import gift.sweets.Sweets;

import java.util.ArrayList;
import java.util.List;

public class Gift {
    private String name;
    private Package pack;
    private List<Sweets> sweets;

    public Gift(String name, Package pack) {
        this.name = name;
        this.pack = pack;
        this.sweets = new ArrayList<>();
    }

    public void addSweet(Sweets sweet) {
        sweets.add(sweet);
    }

    public List<Sweets> getSweets() {return sweets;}

    // Метод для обчислення загальної ціни
    public double getTotalPrice() {
        double total = 0.0;
        for(Sweets sweet: sweets){
            total+=sweet.getPrice();
        }
        return total;
    }

    // Метод для обчислення загальної ваги
    public double getTotalWeight() {
        double total = 0.0;
        for(Sweets sweet: sweets){
            total+=sweet.getWeight();
        }
        return total;
    }

    public String toString() {
        StringBuilder result = new StringBuilder(name + "\n");
        result.append("Пакування: ").append(pack).append("\n");
        result.append("Вміст:\n");

        for (Sweets sweet : sweets) {
            result.append(sweet).append("\n");
        }

        result.append("Загальна ціна: ").append(getTotalPrice()).append("\n");
        result.append("Загальна вага: ").append(getTotalWeight()).append("\n");
        return result.toString();
    }
}
