package figures;

public class Trapecio extends Figura {
    private double anchura;

    private double h;
    private double b1;
    private double b2;

    public Trapecio(double h, double b, double B, double anchura) {
        this.h = h;
        this.b1 = b;
        this.b2 = B;
        this.anchura=anchura;
    }

    public double area() {return this.h * (this.b1 * this.b2 ) / 2;}
    public double volumen() {
        return this.area() * this.anchura;
    }
    public String toString() {return "El trapecio de altura: " + this.h + " base 1: " + this.b1 + " y base 2: " + this.b2 + " tiene como área: " + this.area()+ " y con el ancho de "+ this.anchura +" teniendo como volumen "+ this.volumen();}

}