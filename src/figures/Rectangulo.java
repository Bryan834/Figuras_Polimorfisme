package figures;

public class Rectangulo extends Figura {

    private double l;
    private double L;

    public Rectangulo (){
    }

    public Rectangulo(double l, double L) {
        this.l = l;
        this.L = L;
    }

    public double area() {
        return this.l * this.L;
    }

    public double getl() {
        return l;
    }

    public double getL() {
        return L;
    }

    public String toString() {return "El rectángulo de " + this.l + " y lado " + this.L + " tiene como área: " + this.area();}

}
