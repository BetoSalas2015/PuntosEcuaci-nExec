
/**
 * La clase Termino representa la abstracción de un término. 
 * Un término de una variable en un polinomio es una expresión que 
 * consta de un coeficiente y una variable elevada a un exponente.
 * El coeficiente es el número que se multiplica por la variable y 
 * el exponente es el poder al que se eleva la variable.
 * 
 * @author Roberto Salazar Marquez
 * @version 1.0
 */

public class Termino {
    private double coeficiente;
    private int exponente;

    /**
     * Constructor que inicializa el término con un coeficiente y un exponente dado.
     * @param coef Coeficiente del término.
     * @param exp Exponente del término.
     */
    public Termino(double coef, int exp) {
        this.coeficiente = coef;
        this.exponente = exp;
    }

    /**
     * Constructor que crea un nuevo término basado en otro existente.
     * @param Termino El término a copiar.
     */
    public Termino(Termino Termino) {
        this.coeficiente = Termino.getCoeficiente();
        this.exponente =  Termino.getExponente();
    }

    /**
     * Devuelve el coeficiente del término.
     * @return Coeficiente del término.
     */
    public double getCoeficiente() {
        return coeficiente;
    }

    /**
     * Devuelve el exponente del término.
     * @return Exponente del término.
     */
    public int getExponente() {
        return exponente;
    }

    /**
     * Establece el coeficiente del término.
     * @param coeficiente Nuevo coeficiente.
     */
    public void setCoeficiente(double coeficiente) {
        this.coeficiente = coeficiente;
    }

    /**
     * Establece el exponente del término.
     * @param exponente Nuevo exponente.
     */
    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    /**
     * Evalúa el término en un valor x dado.
     * @param x Valor en el que se evalúa el término.
     * @return Resultado de la evaluación.
     */
    public double evalua(double x) {
        return coeficiente * (Math.pow(x, exponente));
    }

    /**
     * Devuelve una representación de cadena del término.
     * @return Representación de cadena del término.
     */
    public String toString() {
        return coeficiente + "*x^" +  exponente;
    }

    public static void main(String[] args) {
        Termino Termino = new Termino(2, 2);
        System.out.println(Termino.toString());
        System.out.println(Termino.evalua(7));
        System.out.println(Termino.getCoeficiente());
        System.out.println(Termino.getExponente());
        Termino.setCoeficiente(3);
        Termino.setExponente(1);
        System.out.println(Termino.toString());
        System.out.println(Termino.evalua(5));
    }

}