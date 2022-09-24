package org.opentutorials.javatutorials.Inheritance.example;

class Calculator {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class SubstractionalbleCalculator extends Calculator {
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

class MultiplicationableCalculator extends Calculator {
    public void multiplication() {
        System.out.println(this.left * this.right);
    }
}

class DivisionalbeCalcualtor extends MultiplicationableCalculator {
    public void division() {
        System.out.println(this.left / this.right);
    }
}

public class CalculatorDemo1 {
    public static void main(String[] args) {
        SubstractionalbleCalculator c1 = new SubstractionalbleCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();

        MultiplicationableCalculator c2 = new MultiplicationableCalculator();
        c2.setOprands(5, 3);
        c2.sum();
        c2.avg();
        c2.multiplication();

        DivisionalbeCalcualtor c3 = new DivisionalbeCalcualtor();
        c3.setOprands(30, 10);
        c3.sum();
        c3.avg();
        c3.multiplication();
        c3.division();
    }
}
