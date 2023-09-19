package figures;

public class Rombo extends Figura {
    private double anchura;
    public double volumen() {
        return this.area() * this.anchura;
    }
    private double d;
    private double D;

    public Rombo(double d, double D, double anchura) {
        this.d = d;
        this.D = D;
        this.anchura=anchura;
    }

    public double area() {return this.d * this.D / 2;}

    public String toString() {return "El rombo de diagonal 1 " + this.d + " y diagonal 2 " + this.D + " tiene como área: " + this.area()+ " y con el ancho de "+ this.anchura +" teniendo como volumen "+ this.volumen();}

}