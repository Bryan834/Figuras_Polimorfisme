package figures;

public class Cuadrado extends Rectangulo{
    public Cuadrado(){
    }

    public Cuadrado (double l1) {
        super(l1,l1);
    }

    public String toString() {return "El cuadrado de " + super.getL1() + " de lado, tiene como área: " + this.area();}

}
