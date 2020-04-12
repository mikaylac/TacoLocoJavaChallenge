import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrderTest {

    @Test
    public void shouldAddVeggieTacoToOrder() {
        Order testTacoOrder = new Order();
        VeggieTaco veggieTaco = new VeggieTaco();

        testTacoOrder.addToOrder(veggieTaco, 1);
        int expectedNumberOfTacosAdded = 1;
        int actualNumberOfTacosAdded = testTacoOrder.completeOrder.get(veggieTaco);

        assertEquals(expectedNumberOfTacosAdded, actualNumberOfTacosAdded);
        assertTrue(testTacoOrder.completeOrder.containsKey(veggieTaco));
    }
}
