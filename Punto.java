/**
 * Write a description of class Punto here.
 * 
 * @author Roberto Salazar Marquez
 * @version 1.0
 */

public class Punto<E> {
    private E x;
    private E y;

    public Punto(E x, E y) {
        this.x = x;
        this.y = y;
    }

    public Punto(Punto<E> p) {
        this.x = p.getX();
        this.y = p.getY(); 
    }

    public E getX() {
        return x;
    }

    public E getY() {
        return y;
    }

    public void setX(E x) {
        this.x = x;
    }

    public void setY(E y) {
        this.y = y;
    }

    public String toString() {
        return new String( "(" + x + "," + y + ")" );
    }

    public static void main(String[] args) {
        Punto<Integer> punto = new Punto<Integer>(3, 4);
        System.out.println(punto.toString());
        Punto<Double> punto2 = new Punto<Double>(3.2, 4.8);
        System.out.println(punto2.toString());
        Punto<Double> punto3 = new Punto<Double>(punto2);
        System.out.println(punto3.toString());

        
    }

}
