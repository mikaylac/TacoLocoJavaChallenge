import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrderTest {

    private Order testTacoOrder;
    private VeggieTaco veggieTaco;
    private ChorizoTaco chorizoTaco;
    private ChickenTaco chickenTaco;
    private BeefTaco beefTaco;

    @Before
    public void setUp(){
        testTacoOrder = new Order();
        veggieTaco = new VeggieTaco();
        chorizoTaco = new ChorizoTaco();
        chickenTaco = new ChickenTaco();
        beefTaco = new BeefTaco(); 
    }

    @Test
    public void shouldAddVeggieTacoToOrder_WhenAddToOrderCalled() {

        testTacoOrder.addToOrder(veggieTaco, 1);
        int expectedNumberOfTacosAdded = 1;
        int actualNumberOfTacosAdded = testTacoOrder.completeOrder.get(veggieTaco);

        assertEquals(expectedNumberOfTacosAdded, actualNumberOfTacosAdded);
        assertTrue(testTacoOrder.completeOrder.containsKey(veggieTaco));
    }

    @Test
    public void shouldAddChorizoTacoToOrder_WhenAddToOrderCalled(){

        testTacoOrder.addToOrder(chorizoTaco, 1);
        int expectedNumberOfTacosAdded = 1;
        int actualNumberOfTacosAdded = testTacoOrder.completeOrder.get(chorizoTaco);

        assertEquals(expectedNumberOfTacosAdded, actualNumberOfTacosAdded);
        assertTrue(testTacoOrder.completeOrder.containsKey(chorizoTaco));
    }

    @Test
    public void shouldAddBeefTacoToOrder_WhenAddToOrderCalled(){

        testTacoOrder.addToOrder(beefTaco, 1);
        int expectedNumberOfTacosAdded = 1;
        int actualNumberOfTacosAdded = testTacoOrder.completeOrder.get(beefTaco);

        assertEquals(expectedNumberOfTacosAdded, actualNumberOfTacosAdded);
        assertTrue(testTacoOrder.completeOrder.containsKey(beefTaco));
    }

    @Test
    public void shoudAddChickenTacoToOrder_WhenAddToOrderCalled(){

        testTacoOrder.addToOrder(chickenTaco, 1);
        int expectedNumberOfTacosAdded = 1;
        int actualNumberOfTacosAdded = testTacoOrder.completeOrder.get(chickenTaco);

        assertEquals(expectedNumberOfTacosAdded, actualNumberOfTacosAdded);
        assertTrue(testTacoOrder.completeOrder.containsKey(chickenTaco));
    }

    @Test
    public void shouldAddMultipleTacosToOrder_WhenAddToOrderCalled(){

        testTacoOrder.addToOrder(veggieTaco, 2);
        testTacoOrder.addToOrder(chorizoTaco,1);
        testTacoOrder.addToOrder(chickenTaco, 3);
        testTacoOrder.addToOrder(beefTaco, 4);

        int expectedNumberOfTacosAddedToOrder = 10;
        int actualNumberOfTacosAddedToOrder = testTacoOrder.retrieveTotalItemsAddedToOrder();

        assertEquals(expectedNumberOfTacosAddedToOrder, actualNumberOfTacosAddedToOrder);
    }

}
