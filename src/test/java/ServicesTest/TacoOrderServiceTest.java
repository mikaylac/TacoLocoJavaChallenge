package ServicesTest;

import Model.BeefTaco;
import Model.ChickenTaco;
import Model.ChorizoTaco;
import Model.VeggieTaco;
import Services.TacoOrderService;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TacoOrderServiceTest {

    private TacoOrderService testTacoTacoOrderService;
    private VeggieTaco veggieTaco;
    private ChorizoTaco chorizoTaco;
    private ChickenTaco chickenTaco;
    private BeefTaco beefTaco;

    @Before
    public void setUp(){
        testTacoTacoOrderService = new TacoOrderService();
        veggieTaco = new VeggieTaco();
        chorizoTaco = new ChorizoTaco();
        chickenTaco = new ChickenTaco();
        beefTaco = new BeefTaco();
    }

    @Test
    public void shouldAddVeggieTacoToOrder_WhenAddToOrderCalled() {

        testTacoTacoOrderService.addToOrder(veggieTaco, 1);
        int expectedNumberOfTacosAdded = 1;
        int actualNumberOfTacosAdded = testTacoTacoOrderService.completeOrder.get(veggieTaco);

        assertEquals(expectedNumberOfTacosAdded, actualNumberOfTacosAdded);
        assertTrue(testTacoTacoOrderService.completeOrder.containsKey(veggieTaco));
    }

    @Test
    public void shouldAddChorizoTacoToOrder_WhenAddToOrderCalled(){

        testTacoTacoOrderService.addToOrder(chorizoTaco, 1);
        int expectedNumberOfTacosAdded = 1;
        int actualNumberOfTacosAdded = testTacoTacoOrderService.completeOrder.get(chorizoTaco);

        assertEquals(expectedNumberOfTacosAdded, actualNumberOfTacosAdded);
        assertTrue(testTacoTacoOrderService.completeOrder.containsKey(chorizoTaco));
    }

    @Test
    public void shouldAddBeefTacoToOrder_WhenAddToOrderCalled(){

        testTacoTacoOrderService.addToOrder(beefTaco, 1);
        int expectedNumberOfTacosAdded = 1;
        int actualNumberOfTacosAdded = testTacoTacoOrderService.completeOrder.get(beefTaco);

        assertEquals(expectedNumberOfTacosAdded, actualNumberOfTacosAdded);
        assertTrue(testTacoTacoOrderService.completeOrder.containsKey(beefTaco));
    }

    @Test
    public void shouldAddChickenTacoToOrder_WhenAddToOrderCalled(){

        testTacoTacoOrderService.addToOrder(chickenTaco, 1);
        int expectedNumberOfTacosAdded = 1;
        int actualNumberOfTacosAdded = testTacoTacoOrderService.completeOrder.get(chickenTaco);

        assertEquals(expectedNumberOfTacosAdded, actualNumberOfTacosAdded);
        assertTrue(testTacoTacoOrderService.completeOrder.containsKey(chickenTaco));
    }

    @Test
    public void shouldAddMultipleTacosToOrder_WhenAddToOrderCalled(){

        testTacoTacoOrderService.addToOrder(veggieTaco, 2);
        testTacoTacoOrderService.addToOrder(chorizoTaco,1);
        testTacoTacoOrderService.addToOrder(chickenTaco, 3);
        testTacoTacoOrderService.addToOrder(beefTaco, 4);

        int expectedNumberOfTacosAddedToOrder = 10;
        int actualNumberOfTacosAddedToOrder = testTacoTacoOrderService.retrieveTotalItemsAddedToOrder();

        assertEquals(expectedNumberOfTacosAddedToOrder, actualNumberOfTacosAddedToOrder);
    }

    @Test
    public void shouldCalculateOrderTotal_WhenCalculateOrderTotalCalled(){
        testTacoTacoOrderService.addToOrder(chickenTaco, 1);
        testTacoTacoOrderService.addToOrder(beefTaco,1);
        testTacoTacoOrderService.addToOrder(chorizoTaco,1);

        BigDecimal actualOrderTotal = testTacoTacoOrderService.calculateOrderTotal();

        BigDecimal expectedOrderTotal = new BigDecimal("9.50");

        assertEquals(expectedOrderTotal, actualOrderTotal);
    }

    @Test
    public void shouldApplyTwentyPercentDiscountIfFourOrMoreTacosAreAddedToOrder_WhenCalculateOrderTotalCalled(){
        testTacoTacoOrderService.addToOrder(veggieTaco, 2);
        testTacoTacoOrderService.addToOrder(chickenTaco, 3);
        testTacoTacoOrderService.addToOrder(beefTaco,1);
        testTacoTacoOrderService.addToOrder(chorizoTaco,5);

        BigDecimal actualOrderTotalWithDiscount = testTacoTacoOrderService.calculateOrderTotal();

        BigDecimal expectedOrderTotal = new BigDecimal("27.60");

        assertEquals(expectedOrderTotal, actualOrderTotalWithDiscount);

    }


}
