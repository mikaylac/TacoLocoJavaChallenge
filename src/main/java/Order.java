import java.util.HashMap;
import java.util.Map;

public class Order {

    public Map<Taco, Integer> completeOrder = new HashMap<>();

    public void addToOrder(Taco tacoToAdd, int numberOfTacosToAdd){
        completeOrder.put(tacoToAdd, numberOfTacosToAdd);
    }
}
