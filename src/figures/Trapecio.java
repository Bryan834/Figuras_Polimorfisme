package figures;

public class Trapecio extends Figura {

    private double h;
    private double b1;
    private double b2;

    public Trapecio(double h, double b, double B) {
        this.h = h;
        this.b1 = b;
        this.b2 = B;
    }

    public double area() {return this.h * (this.b1 * this.b2 ) / 2;}

    public String toString() {return "El trapecio de altura: " + this.h + " base 1: " + this.b1 + " y base 2: " + this.b2 + " tiene como área: " + this.area();}

}