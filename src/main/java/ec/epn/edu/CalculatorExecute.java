package ec.epn.edu;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("Calculator Execute");

        Calculator c =  new Calculator();
        double suma = c.sumar(25.0,6.0);
        System.out.println("c.sumar(25.0,6.0) = "+suma);

        double resta = c.restar(38.0,13.0);
        System.out.println("c.restar(38.0,13.0) = "+resta);
    }
}
