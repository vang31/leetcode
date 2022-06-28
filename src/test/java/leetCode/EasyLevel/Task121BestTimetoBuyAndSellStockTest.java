package leetCode.EasyLevel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task121BestTimetoBuyAndSellStockTest {

    private final Task121BestTimetoBuyAndSellStock sellStock = new Task121BestTimetoBuyAndSellStock();
    private final int[] prices1 = new int[]{7,1,5,3,6,4};
    private final int[] prices2 = new int[]{7,6,4,3,1};

    @Test
    void getProfitWithMathFunction() {
        assertEquals(5, sellStock.getProfitWithMathFunction(prices1));
    }

    @Test
    void getProfitWithOutMathFunction() {
        assertEquals(5, sellStock.getProfitWithOutMathFunction(prices1));
    }

    @Test
    void doNotgetProfitWithOutMathFunction() {
        assertEquals(0, sellStock.getProfitWithMathFunction(prices2));
    }

    @Test
    void doNotgetProfitWithMathFunction() {
        assertEquals(0, sellStock.getProfitWithOutMathFunction(prices2));
    }
}