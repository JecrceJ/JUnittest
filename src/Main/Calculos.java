package Main;

import java.util.Scanner;

public class Calculos extends Main {
    Scanner in = new Scanner(System.in);
    double areaCua = 0;

    public double pedirDatos() {
        double n = 0;
        System.out.println("Digite el primer numero");
        n = in.nextDouble();
        return n;
    }

    public double areaCuad(double n) {
        areaCua=(n * n);
        return areaCua;
    }

    public boolean testareaCuad(){
        boolean test=false;
        if (areaCua>1) { test=true; }
        return test;
    }
    public double diametroCirc(double n){
        return (Math.PI * (Math.pow(n, 2)));
    }

    public boolean numInText(String txt) {
        char[] toCheck = txt.toCharArray();
        for (int i = 0; i < toCheck.length; i++) {
            if (!Character.isDigit(toCheck[i])) {
                return false;
            } else return true;
        }
        return false;
    }

    public boolean mayuscText(String txt) {
        char[] toCheck = txt.toCharArray();
        for (int i = 0; i < toCheck.length; i++) {
            return Character.isUpperCase(toCheck[i]);
        }
        return false;
    }

    public boolean numPrimo(double n) {
        return isPrim(n);
    }

    public static boolean isPrim(double n) {
        int contador, i;
        contador = 0;
        for (i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                contador++;
            }
        }
        if (contador == 2) { return true; }
        return false;
    }
}