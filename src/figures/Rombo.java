package figures;

public class Rombo extends Figura {

    private double d;
    private double D;

    public Rombo(double d, double D) {
        this.d = d;
        this.D = D;
    }

    public double area() {return this.d * this.D / 2;}

    public String toString() {return "El rombo de diagonal 1 " + this.d + " y diagonal 2 " + this.D + " tiene como área: " + this.area();}

}