import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class BunParametrizedTest {
    private final String name;
    private final float price;

    public BunParametrizedTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
            {"~!@#$%^*()_-[]{}:; '", 0.1f},
            {"Краторная булка N-200i", 1255},
            {"", -200},
            {null, 0},
            {"К", 1000000000}
        };
    }

    @Test
    public void getNameBunTest() {
        Bun bun = new Bun(name, price);
        String actualName = bun.getName();
        assertEquals("Название булки неверно", name, actualName);
    }

    @Test
    public void getPriceBunTest() {
        Bun bun = new Bun(name, price);
        float actualPrice = bun.getPrice();
        assertEquals("Стоимость булки неверна", price, actualPrice,0);
    }
}