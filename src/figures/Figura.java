package figures;
public abstract class Figura implements Comparable<Figura> {

    public abstract double area();
    public abstract double volumen();

    public int compareTo(Figura f){
        return ((int)(this.area() - f.area()) + (int)(this.volumen() - f.volumen()));
    }


}
