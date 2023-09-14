package figures;

public class Cuadrado extends Rectangulo{
    public Cuadrado(){
    }
    private double l1;
    public Cuadrado (double l1) {
        this.l1 = l1;
    }
    public double area() {
        return (this.l1 * this.l1);
    }
    public double getL1() {
        return l1;
    }

    public String toString() {return "El cuadrado de " + this.l1 + " de lado, tiene como área: " + this.area();}

}
