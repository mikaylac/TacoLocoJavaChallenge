import java.math.BigDecimal;

public class ChickenTaco implements Taco {

    private BigDecimal price = new BigDecimal("3.00");

    public BigDecimal getPrice() {
        return price;
    }
}
