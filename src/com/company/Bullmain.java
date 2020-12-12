package com.company;

public class Bullmain {
    public static void main(String[] args) {
        Bull bull = new Bull(" Ira", 4  );


        System.out.println(bull);


        Bull[] bulls = new Bull[100];
        for (int i = 0; i < bulls.length; i++) {



        }
        System.out.println("Bull count:" + bull.COUNT);

        Bull IraSorokina = new Bull("Sorokina", 2 );
        Bull Maxim = new Bull("Maximka", 3 );
        System.out.println("Does IraSorokina win?" + IraSorokina.fight(Maxim));
        System.out.println("Does Maxim win?" + IraSorokina.fight(IraSorokina));

    }
}

