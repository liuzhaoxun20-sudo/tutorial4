package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2,2));
    }
    @Test
    public void testSubtraction() {
        Calc c = new Calc();
        // 这个测试会失败，因为 subtract 方法还没有实现
        assertEquals(2, c.subtract(4, 2));
    }
}
