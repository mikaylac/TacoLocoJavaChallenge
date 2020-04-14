import java.math.BigDecimal;

public class VeggieTaco implements Taco {

    private BigDecimal price = new BigDecimal("2.50");

    public BigDecimal getPrice() {
        return price;
    }


}
