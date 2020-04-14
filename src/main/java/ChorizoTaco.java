import java.math.BigDecimal;

public class ChorizoTaco implements Taco {

    private BigDecimal price = new BigDecimal("3.50");

    public BigDecimal getPrice() {
        return price;
    }
}
