import figures.*;

import java.util.Arrays;


public class GestorFiguras {

    public static void sort (Figura [] v) {
        Arrays.sort(v);

    }

    public static double suma (Figura[] v) {
        double ret = 0;
        for (Figura f: v) {
            System.out.println(f);
            ret += f.area();
        }
        return ret;
    }

    public static void main(String[] args) {
        Figura[] v = new Figura[4];
        v[0] = new Circulo(5);
        v[1] = new Rectangulo(2,1);
        v[2] = new Triangulo(2,3);
        v[3] = new Cuadrado(4);

        double r = GestorFiguras.suma(v);

        System.out.println("El área total es: "+ r);
    }
}
