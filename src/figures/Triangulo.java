package figures;

public class Triangulo extends Figura {
    public Triangulo(){}
    private double b;
    private double h;

    private double anchura;

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }
    public Triangulo (double b, double h, double anchura){
        this.b=b;
        this.h=h;
        this.anchura=anchura;
    }
    public double area(){
        return (this.b*this.h/2);
    }
public double volumen(){return this.area() * this.anchura;}
    public String toString() {return "El triangulo de base " + this.b + " y altura " + this.h + " tiene como área: " + this.area()+ " y con el ancho de "+ this.anchura +" teniendo como volumen "+ this.volumen();}

}
