package com.company;

public class Cow {
    String name;
    int age;

    public Cow() {
        System.out.println("Cow created");
    }

    public Cow(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print() {
        System.out.println("Cow name=" + name + ", age=" + age);
    }
}
