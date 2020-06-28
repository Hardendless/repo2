package cn.day01.Test;


import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    /*
    * 测试add方法
    * */
    @Before
    public void init(){
        System.out.println("init...");
    }



    @org.junit.Test
    public void testAdd(){
        System.out.println("我被执行了");
    }
    @Test
    public void testSub(){
        System.out.println("减法执行了");
    }

}
