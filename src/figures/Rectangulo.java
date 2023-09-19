package figures;

public class Rectangulo extends Figura {

    private double l;
    private double L;
private double anchura;
    public Rectangulo (){
    }

    public Rectangulo(double l, double L, double anchura) {
        this.l = l;
        this.L = L;
        this.anchura=anchura;
    }

    public double area() {
        return this.l * this.L;
    }
    public double volumen() {
        return this.area() * this.anchura;
    }
    public double getl() {
        return l;
    }

    public double getL() {
        return L;
    }

    public double getAnchura(){return anchura;}

    public String toString() {return "El rectángulo de lado " + this.l + " y lado " + this.L + " tiene como área: " + this.area() + " y con el ancho de "+ this.anchura +" teniendo como volumen "+ this.volumen(); }

}
