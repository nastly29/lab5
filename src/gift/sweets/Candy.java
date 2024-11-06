package gift.sweets;
import gift.types.CandyType;

public class Candy extends Sweets{
    private String filling;
    private CandyType type;

    public Candy(int code,String name, double weight, double sugarContent,
                 double price, String filling, CandyType type) {
        super(code,name, weight, sugarContent, price, "candy");
        this.filling=filling;
        this.type=type;
    }

    public String toString() {
        return super.toString() + "| начинка: " + filling + "| тип: " + type;
    }
}
