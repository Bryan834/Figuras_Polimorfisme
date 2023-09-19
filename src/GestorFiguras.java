import figures.*;

import java.util.Arrays;


public class GestorFiguras {

    public static double sort (Figura [] v) {
        Arrays.sort(v);

        return 0;
    }

    public static double suma (Figura[] v) {
        double ret = 0;

        for (Figura f : v) {
            System.out.println(f);
            ret += f.area();
        }
        return ret;
    }
    public static double suma2 (Figura[] v){
        double res = 0;
        for (Figura f: v) {
            System.out.println(f);
            res += f.volumen();
        }
        return res;

    }

    public static void main(String[] args) {
        Figura[] v = new Figura[6];
        v[0] = new Circulo(5, 4);
        v[1] = new Rectangulo(2,1, 5);
        v[2] = new Triangulo(2,3, 3);
        v[3] = new Cuadrado(4, 2);
        v[4] = new Rombo(2,5, 4);
        v[5] = new Trapecio(3,2,6, 2);

        double s = GestorFiguras.sort(v);
        double r = GestorFiguras.suma(v);
        double p = GestorFiguras.suma2(v);


        System.out.println("El área total es: "+ r+ " y el volumen total es: "+p);
    }
}
