package Main;

public class Main {                                                     //Creacion de la clase principal
    public static void main(String[] args) {                            //Metodo principal
        String txt= "H0l4 MundO";
        Calculos cc = new Calculos();                                   //Iniciacion de la clase calculos como cc
        double n= cc.pedirDatos();
        double cuad=cc.areaCuad(n);
        double circ=cc.diametroCirc(n);
        boolean num=cc.numInText(txt);
        boolean Upp=cc.mayuscText(txt);
        boolean prim=cc.numPrimo(n);
        Testclass test = new Testclass();
        test.checkCuad(cuad);
    }
}