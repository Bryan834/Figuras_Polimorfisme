package figures;

public class Cuadrado extends Rectangulo{
    public Cuadrado(){
    }



    public Cuadrado (double l1, double anchura) {
        super(l1,l1, anchura);
    }

    public String toString() {return "El cuadrado de " + super.getL() + " de lado, tiene como área: " + this.area()+ " y con el ancho de "+ this.getAnchura() + " teniendo como volumen "+ this.volumen();}

}
