package algorithm;

import utils.IntegerArrayUtils;

public class BaseNService {

    private int[] baseNComb;
    private int arrSize;
    private int baseN;

    public BaseNService(int n, int base) {
        this.arrSize = n;
        this.baseNComb = new int[n];
        this.baseN = base;
        IntegerArrayUtils.reset(baseNComb);
    }

    public int[] getCurrentBitMap(){
        return baseNComb;
    }

    public int[] getNextMap() {
        int sum = 1;
        int carry = 0;
        baseNComb[0] = baseNComb[0] + sum + carry;
        carry = baseNComb[0] / baseN;
        baseNComb[0] %= baseN;
        for (int i = 1; i < arrSize; i++) {
            baseNComb[i] += carry;
            carry = baseNComb[i] / baseN;
            baseNComb[i] %= baseN;
        }
        return baseNComb;
    }
}
