import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;

public class Order {

    public Map<Taco, Integer> completeOrder = new HashMap<>();

    public void addToOrder(Taco tacoToAdd, int numberOfTacosToAdd){
        completeOrder.put(tacoToAdd, numberOfTacosToAdd);
    }

    public int retrieveTotalItemsAddedToOrder() {
        int totalNumberOfItemsAddedToOrder = 0;
        for (int numberOfTacos : completeOrder.values()){
            totalNumberOfItemsAddedToOrder += numberOfTacos;
        }
        return totalNumberOfItemsAddedToOrder;
    }


    public BigDecimal calculateOrderTotal() {
       BigDecimal orderTotal = new BigDecimal(0);
       MathContext mathContext = new MathContext(4);
        for (Map.Entry<Taco, Integer> orderItem : completeOrder.entrySet()) {
            BigDecimal tacoPrice = orderItem.getKey().getPrice();
            int quantityOrdered = orderItem.getValue();
            BigDecimal amountToAddToTotal = tacoPrice.multiply(new BigDecimal(quantityOrdered));
            orderTotal = orderTotal.add(amountToAddToTotal,mathContext);
        }

       return orderTotal;

    }
}
