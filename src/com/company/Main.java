package com.company;

public class Main {

    public static void main(String[] args) {
        Cow cow = new Cow("Vlad", 2);

        cow.setAge(2);
        cow.setName("Vlad");
        cow.print();
        Cow cow1 = new Cow("Sasha", 3 );


        cow1.setAge(3);
        cow1.setName("Sasha");
        cow1.print();


    }
}
