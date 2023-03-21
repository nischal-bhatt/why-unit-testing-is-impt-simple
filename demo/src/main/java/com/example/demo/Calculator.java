package com.example.demo;

public class Calculator {

    public int add(Integer a, Integer b)
    {
        return a.intValue() + b.intValue();
    }

    public int subtract(Integer a, Integer b)
    {
        return a - b;
    }

    public int multiply(Integer a, Integer b)
    {
        return a * b;
    }

    public int divide (Integer a, Integer b)
    {
        if (a/b == 0)
        {
            System.out.println("in here?");
            this.divideTest(a,b,3);
        }else {
            this.divideTest(a, b, a / b);
        }
        return a/b;
    }

    private void divideTest(Integer a, Integer b, Integer c)
    {
        if (a/b == c)
        {
            System.out.println("all good");
        }else
        {
            if (a == 99)
            {
                return;
            }

            System.out.println("or here");
            throw new IllegalArgumentException("lol");
        }
    }
}
