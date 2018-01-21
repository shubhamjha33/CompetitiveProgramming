package algorithm;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BaseNServiceTest {

    @Test
    public void testBase2() throws Exception {
        BaseNService baseNService = new BaseNService(10, 2);
        int[] actualBitMap;
        int val;
        int pow = 1;
        for (int i = 0; i < 1024; i++) {
            actualBitMap = baseNService.getCurrentBitMap();
            val = 0;
            pow = 1;
            for (int j = 0; j < 10; j++) {
                val += actualBitMap[j] * pow;
                pow *= 2;
            }
            baseNService.getNextMap();
            assertEquals("Value did not match", i, val);
        }
    }

    @Test
    public void testBase3() throws Exception {
        BaseNService baseNService = new BaseNService(10, 3);
        int[] actualBitMap;
        int val;
        int pow = 1;
        for (int i = 0; i < 59049; i++) {
            actualBitMap = baseNService.getCurrentBitMap();
            val = 0;
            pow = 1;
            for (int j = 0; j < 10; j++) {
                val += actualBitMap[j] * pow;
                pow *= 3;
            }
            baseNService.getNextMap();
            assertEquals("Value did not match", i, val);
        }
    }
}
