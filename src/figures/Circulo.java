package figures;

public class Circulo extends Figura {

    public double r;
private double anchura;
    public Circulo(double r, double anchura) {
        this.anchura=anchura;
        this.r = r;
    }

    public double area() {
        return Math.PI * Math.pow(this.r, 2);
    }

    public double volumen() {
        return this.area() * this.anchura;
    }



    @Override
    public String toString() {return "El círculo de radio " + this.r + " tiene de área: " + this.area()+ " y con el ancho de "+ this.anchura +" teniendo como volumen "+ this.volumen();}
}
