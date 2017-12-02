package pl.marek.hello.Calculator;

import pl.marek.hello.Calculator.Kalkulator;

public class MainK {
    public static void main(String[] args) {
        Kalkulator calc = new Kalkulator();
        System.out.println(calc.add(10,20));
        System.out.println(calc.multiply(5,3));
        System.out.println(calc.substract(9,3));
        System.out.println(calc.divide(50,2));
        System.out.println(calc.pow(2,3));
        System.out.println(calc.abs(-9));
        calc.printOperations(); //żeby pokazać działania należy stworzyć tablicę która pętlą będzie wstawiała kolejno wykonywane operacje

    }
}
