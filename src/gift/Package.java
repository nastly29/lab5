package gift;
import gift.types.ColorType;

public class Package {
    private ColorType boxColor;
    private ColorType ribbonColor;
    private String message;

    public Package(ColorType boxColor, ColorType ribbonColor, String message) {
        this.boxColor = boxColor;
        this.ribbonColor = ribbonColor;
        this.message = message;
    }

    public String toString() {
        return "Колір коробки: " + boxColor + ", Колір стрічки: " + ribbonColor + ", Записка: " + message;
    }
}
