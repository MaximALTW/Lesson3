package com.company;

public class Bull {
    public static final String BULL_CREATED = "Bull created";
    public static final String BULL_CREATED_WITH_NAME = "Bull created with name";
    public static int COUNT;
    int power;
    String name;

    public Bull() {
        System.out.println("Bull Created");
    }

    public Bull(String name, int power) {
        this.power = power;
        COUNT++;
        this.name = name;
        System.out.println("Bull created with name");
    }

    public static void getCount() {
    }
    public void setPower(int Power)
    {
        this.power = power;
    }
    public String toString() {
        return "Bull" + name + ", power=" +power;
    }
    public boolean fight(Bull bull){
         return this.power > bull.power;
    }

}

