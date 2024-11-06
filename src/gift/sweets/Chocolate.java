package gift.sweets;
import gift.types.ChocolateType;

public class Chocolate extends Sweets{
    private double cocoaPercentage;
    private String filling;
    private ChocolateType type;

    public Chocolate(int code,String name, double weight, double sugarContent,
                     double price, double cocoaPercentage, String filling, ChocolateType type) {
        super(code,name, weight, sugarContent, price, "chocolate");
        this.cocoaPercentage=cocoaPercentage;
        this.filling=filling;
        this.type=type;
    }

    public String toString() {
        return super.toString() + "| відсоток какао: " + cocoaPercentage + "| начинка: " + filling + "| вид: " + type;
    }
}
