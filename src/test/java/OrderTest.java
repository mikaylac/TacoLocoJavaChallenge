import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrderTest {

    @Test
    public void shouldAddVeggieTacoToOrder_WhenAddToOrderCalled() {
        Order testTacoOrder = new Order();
        VeggieTaco veggieTaco = new VeggieTaco();

        testTacoOrder.addToOrder(veggieTaco, 1);
        int expectedNumberOfTacosAdded = 1;
        int actualNumberOfTacosAdded = testTacoOrder.completeOrder.get(veggieTaco);

        assertEquals(expectedNumberOfTacosAdded, actualNumberOfTacosAdded);
        assertTrue(testTacoOrder.completeOrder.containsKey(veggieTaco));
    }

    @Test
    public void shouldAddChorizoTacoToOrder_WhenAddToOrderCalled(){
        Order testTacoOrder = new Order();
        ChorizoTaco chorizoTaco = new ChorizoTaco();

        testTacoOrder.addToOrder(chorizoTaco, 1);
        int expectedNumberOfTacosAdded = 1;
        int actualNumberOfTacosAdded = testTacoOrder.completeOrder.get(chorizoTaco);

        assertEquals(expectedNumberOfTacosAdded, actualNumberOfTacosAdded);
        assertTrue(testTacoOrder.completeOrder.containsKey(chorizoTaco));
    }

    @Test
    public void shouldAddBeefTacoToOrder_WhenAddToOrderCalled(){
        Order testTacoOrder = new Order();
        BeefTaco beefTaco = new BeefTaco();

        testTacoOrder.addToOrder(beefTaco, 1);
        int expectedNumberOfTacosAdded = 1;
        int actualNumberOfTacosAdded = testTacoOrder.completeOrder.get(beefTaco);

        assertEquals(expectedNumberOfTacosAdded, actualNumberOfTacosAdded);
        assertTrue(testTacoOrder.completeOrder.containsKey(beefTaco));
    }

    @Test
    public void shoudAddChickenTacoToOrder_WhenAddToOrderCalled(){
        Order testTacoOrder = new Order();
        ChickenTaco chickenTaco = new ChickenTaco();

        testTacoOrder.addToOrder(chickenTaco, 1);
        int expectedNumberOfTacosAdded = 1;
        int actualNumberOfTacosAdded = testTacoOrder.completeOrder.get(chickenTaco);

        assertEquals(expectedNumberOfTacosAdded, actualNumberOfTacosAdded);
        assertTrue(testTacoOrder.completeOrder.containsKey(chickenTaco));
    }
}
