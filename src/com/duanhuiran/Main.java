package com.duanhuiran;

import java.lang.management.MemoryType;

public class Main {

    public static void main(String[] args) {

//int除法后，会自动去尾
	    int result = 11 / 3;
        System.out.println(result);
//double 和 float 的区别是double精度高，有效数字16位，float精度7位（可提供7位或8位有效数字，构成包括符号位、指数位和尾数位）。
//但double消耗内存是float的两倍，double的运算速度比float慢得多，能用单精度时不要用双精度。

//不在计算公式内部加double的话，出来的结果只会是整数运算去尾法后加个.0（3.0）完全不正确
        double result_2 = 11/3;
        System.out.println(result_2);
//都加double
        double result_3 = (double)11/(double)3;
        System.out.println(result_3);
//++x 和 x++ 的区别，++x 会优先运算，x++ 会滞后运算，但都会改变x的值。
        int x1 = 1;
        int x2 = 1;
        int y = x1++;
        int z = ++x2;
//他妈的在java里string居然可以和int、float、double等直接相加！！！又跟Python不一样！
        System.out.println("result of \"x++\" is " + x1);
        System.out.println("result of \"++x\" is " + x2);
        System.out.println("result of \"y = x++\" is " + y);
        System.out.println("result of \"z = ++x\" is " + z);
// *= /= 等运算符号
        int x3 = 3;
        x3 *= 3;
        System.out.println("\"x3 *= 3\" is " + x3);

        float x5 = 5;
        x5 /= 2;
        System.out.println("\"x5 /= 5\" is " + x5);

        float y2 = (x5 /=2);
        System.out.println(y2);
        System.out.println(x5);

// implicit casting 隐式转换
//        byte < short < int < long < float < double
//        short --> 2 byte
        short x6 = 1;
//        int --> 4 byte
        int y3 = 2;
        System.out.println(y3 + x6);

        double x7 = 1.9;
        double y5 = x7 + 2; // treated as 2.0
        System.out.println(y5);

        double y6 = (int)x7 + 2;// 用(int)number 来改变类型，也遵循去尾法
        System.out.println(y6);

        double y7 = Math.round(x7) + 2;// Math.round四舍五入取整
        System.out.println(y7);

//把string转化为int
        String x8 = "33";
        System.out.println(Integer.parseInt(x8) + 6);

        String x9 = "33.33";
        System.out.println(Float.parseFloat(x9) + 6);

// Math class
//        Math.ceil()的返回值type是double或者long等等（虽然有时候看起来是int）
        int result_5 = (int)Math.round(1.7);
        System.out.println(result_5);

        int result_6 = (int)Math.floor(1.7);
        System.out.println(result_6);

        double result_7 = Math.max(1.7,2);
        System.out.println(result_7);

        int result_8 = (int)Math.round(Math.random() * 100);
        System.out.println(result_8);



    }
}
