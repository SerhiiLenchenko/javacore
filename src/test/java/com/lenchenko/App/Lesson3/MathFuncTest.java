package com.lenchenko.App.Lesson3;

/**
 * Created by fishes on 3/17/2017.
 */
public class MathFuncTest {
    int a = 5;
    int b = 10;

    @Test
    public void multiplyTest(){
        MathFunc mathFunc = new MathFunc();
        int actualResult = mathFunc.multiply(a, b);
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void addition(){
        MathFunc mathFuncSum = new MathFunc();
        int actualResult = mathFuncSum.add(a,b);
        int expectedResult = 15;
        Assert.assertEquals(expectedResult, actualResult);
    }
}
