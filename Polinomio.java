/**
 * La clase Polinomio representa la abstracción de un Polinomio. 
 * Un polinomio de una variable es una expresión algebraica compuesta 
 * por términos que constan de una variable (como x) y coeficientes numéricos. 
 * Estos términos están conectados por operaciones de suma y resta. Cada término 
 * en un polinomio tiene un exponente que indica la potencia a la que se eleva 
 * la variable. El grado del polinomio es el exponente más alto en todos 
 * los términos.
 * 
 * @author Roberto Salazar Marquez
 * @version 1.0
 */

public class Polinomio {
    public Termino terminos[];

    /**
    * Constructor que crea un polinomio de un grado específico.
    * @param grado el grado del polinomio.
    */
    public Polinomio(int grado) {
        this.terminos = new Termino[grado + 1];
    }

    /**
    * Constructor que crea un polinomio a partir de otro polinomio existente.
    * @param polinomio el polinomio existente.
    */
    public Polinomio(Polinomio polinomio) {
        this.terminos = new Termino[polinomio.getGrado()];
        
        for (int i = 0; i < terminos.length; i++) {
            if (polinomio.getTermino(i) != null) {
                agregaTermino(polinomio.getTermino(i));
            }
        }
    }

    /**
    * Método que agrega un término al polinomio.
    * @param termino el término a agregar.
    */
    public void agregaTermino(Termino termino) {
        this.terminos[termino.getExponente()] = termino;
    }

    /**
    * Método que devuelve el término en un índice específico.
    * @param index el índice del término (su exponente).
    * @return el término en el índice especificado.
    */
    public Termino getTermino(int index) {
        return terminos[index];
    }

    /**
    * Método que devuelve el grado del polinomio.
    * @return el grado del polinomio.
    */
    public int getGrado() {
        return terminos.length;
    }

    /**
    * Método que evalúa el polinomio en un valor de x.
    * @param x el valor en el que evaluar el polinomio.
    * @return el resultado de evaluar el polinomio.
    */
    public double evalua(double x) {
        double sum = 0.0;
        for (Termino termino : terminos) {
            if (termino != null) {
                sum += termino.evalua(x);
            }
        }
        return sum;
    }

    /**
    * Método que devuelve una representación en cadena del polinomio.
    * @return una representación en cadena del polinomio.
    */
    public String toString() {
        String poli = "";
        for (int i = terminos.length - 1; i >= 0; i--) {
            if (terminos[i] != null) {
                if (terminos[i].getExponente() == 0) {
                    if (terminos[i].getCoeficiente() < 0) {
                        poli += " " + terminos[i].getCoeficiente();
                    } else {
                        poli += " +" + terminos[i].getCoeficiente();
                    }
                    break;
                }
                if (terminos[i].getCoeficiente() > 0) {
                    poli += " +" +terminos[i].toString();
                } 
                if(terminos[i].getCoeficiente() < 0)
                {
                    poli += " " + terminos[i].toString();
                }
                
            }
        }
        
        return poli;
    }

    public static void main(String[] args) {
        Polinomio polinomio = new Polinomio(3);
        Termino Termino2 = new Termino(2,2);
        Termino Termino = new Termino(-7,1);
        polinomio.agregaTermino(Termino2); 
        System.out.println(polinomio.evalua(2));
        polinomio.agregaTermino(Termino);
        Termino Termino3 = new Termino(-5,0);
        polinomio.agregaTermino(Termino3);
        System.out.println(polinomio.toString());
        
        polinomio.agregaTermino(Termino2);
        Polinomio polinomio2 = new Polinomio(polinomio);
        System.out.println(polinomio2.toString());

    }
}
