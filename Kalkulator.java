package pl.marek.hello.Calculator;

import java.lang.Math;

public class Kalkulator {

    private String[] opHistory;
    private int opNumber;
//tablica stringów stworzona do przechowywania historii

    public Kalkulator() {
        opHistory = new String[10];
        opNumber = 0;
    }

    public int add(int a, int b) {
        addOperation("Dodanie " + a + " do " + b);
        return a + b;
    }

    public int multiply(int a, int b) {
        addOperation("Pomnożenie " + a + "*" + b);
        return a * b;
    }

    public int substract(int a, int b) {
        addOperation("Odejmowanie " + a + "-" + b);
        return a - b;
    }

    public int divide(int a, int b) {
        addOperation("Dzielenie " + a + "/" + b);
        return a / b;
    }
    public double pow(double a, double b) {
        addOperation("Potęguj " + a + "^" + b);
        return Math.pow(a,b);
    }
    public int abs(int a){
        addOperation("Liczba bezwzględna" + "|"+a+"|");
        return Math.abs(a);
    }


    public void printOperations() {
        for (int i = opNumber; i < opNumber + 10; i++) {
            System.out.println(opHistory[i % 10]); // modulo 10 dla liczb mniejszych niz 10 zwaraca tę liczbę
        }
    }

    private void addOperation(String operation) {
        opHistory[opNumber] = operation;
        opNumber++;
        opNumber = opNumber % 10; // modulo dlatego, że interesuje nas 10 istatnich operacji
    }
//żeby zapamiętać historię liczenia trzrba stworzyć metodę ADD opearations, która ma dodać je do tablicy

}
