import java.util.Vector;

public class PuntosEcuacion {
    private Vector<Punto<Double>> puntos;
    private Polinomio polinomio;

    public PuntosEcuacion(Polinomio poli, double linf, double lsup, double inc) {
        this.polinomio = new Polinomio(poli);
        this.puntos = new Vector<Punto<Double>>();
        System.out.println("linf=" + linf + ", lsup=" + lsup + ", lsup-linf=" + (lsup-linf));
        for (double index = linf; index <= lsup; index += inc) {
            puntos.add(new Punto<Double>(index, polinomio.evalua(index)));
        }
    }

    public Vector<Punto<Double>> getPuntosEcuacion() {
        return new Vector<Punto<Double>>(puntos);
    }

    public Punto<Double> getPunto(int index) {
        return puntos.get(index);
    }

    public String toString() {
        String cad = new String();
        cad += polinomio.toString() + "\n";
        for (int index = 0; index < puntos.size(); index++) {
            cad += "(" + puntos.get(index).getX().toString() + "," + puntos.get(index).getY().toString() + ")\n"; 
        }
        return cad;
    }

    public static void main(String[] args) {
        Termino termino = new Termino(2,2);
        Polinomio polinomio = new Polinomio(2);
        polinomio.agregaTermino(termino);
        PuntosEcuacion puntosEcuacion = new PuntosEcuacion(polinomio, -5, 5, 1);
        System.out.println(puntosEcuacion.toString());
    }

}
