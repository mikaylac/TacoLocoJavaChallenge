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


}
