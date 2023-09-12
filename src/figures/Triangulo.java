package figures;

public class Triangulo extends Figura {
    public Triangulo(){}
    private double b;
    private double h;

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }
    public Triangulo (double b, double h){
        this.b=b;
        this.h=h;
    }
    public double area(){
        return (this.b*this.h/2);
    }

    public String toString() {return "El triangulo de base " + this.b + " y altura " + this.h + " tiene como área: " + this.area();}

}
