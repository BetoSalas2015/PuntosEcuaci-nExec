/**
 * TestPuntosEcuacion
 */
public class TestPuntosEcuacion {

    public static void main(String[] args) {
        Termino termino1 = new Termino(7,1);
        Termino termino2 = new Termino(2, 2);
        Termino termino3 = new Termino(1, 3);

        Polinomio polinomio = new Polinomio(4);
        polinomio.agregaTermino(termino3);
        System.out.println(polinomio.toString());
        System.out.println(polinomio.evalua(5));

        polinomio.agregaTermino(termino2);
        System.out.println(polinomio.toString());
        System.out.println(polinomio.evalua(5));

        polinomio.agregaTermino(termino1);
        System.out.println(polinomio.toString());
        System.out.println(polinomio.evalua(5));

        Polinomio polinomio2 = new Polinomio(polinomio);
        System.out.println(polinomio2.toString());
        System.out.println(polinomio2.evalua(5));

        Punto<Integer> punto = new Punto<Integer>(3, 4);
        System.out.println(punto.toString());
        Punto<Double> punto2 = new Punto<Double>(3.2, 4.8);
        System.out.println(punto2.toString());

        polinomio = new Polinomio(3);
        polinomio.agregaTermino(termino2);

        PuntosEcuacion puntosEcuacion = new PuntosEcuacion(polinomio, -5, 5, 1);
        System.out.println(puntosEcuacion.getPunto(3).toString());
        System.out.println(puntosEcuacion.toString());

    }
}