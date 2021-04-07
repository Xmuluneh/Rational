package com.company;

public class Main {

    public static void main(String[] args) {
	Rational rational=new Rational(4,2);
	Rational rational1=new Rational(2,3);
        System.out.println( rational+"+"+rational1+"="+rational.add(rational1));
        System.out.println( rational+"-"+rational1+"="+rational.subtract(rational1));
        System.out.println( rational+"*"+rational1+"="+rational.multiply(rational1));
        System.out.println( rational+"/"+rational1+"="+rational.division(rational1));

    }
}
