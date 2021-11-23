package cupdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CupTest {

    @Test
    void getLiquidType() {
        Cup c = new Cup("Orange Juice", 85.5);
        Assertions.assertEquals("Orange Juice", c.getLiquidType());

    }

    @Test
    void getPercentFull() {
        Cup c = new Cup("Orange Juice", 85.5);
        Assertions.assertEquals(85.5, c.getPercentFull(), 0.001);

    }

    @Test
    void setLiquidType() {
        Cup c = new Cup("Orange Juice", 85.5);
        c.setLiquidType("Water");
        Assertions.assertEquals("Water", c.getLiquidType());
    }

    @Test
    void setPercentFull() {
        Cup c = new Cup("Orange Juice", 85.5);
        c.setPercentFull(55);
        Assertions.assertEquals(55, c.getPercentFull(), 0.001);

    }
}