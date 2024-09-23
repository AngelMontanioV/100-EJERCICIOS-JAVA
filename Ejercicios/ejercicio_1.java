
public class ejercicio_1 {

    public static void main(String[] args) {
        /*
         * 
         * Escribe un programa que muestre por consola (con un print) Los números de 1 a
         * 100 (ambos incluidos y con un salto de Linea entre cada impresión),
         * sustituyendo los siguientes:
         * 
         * Múltiplos de 3 por la palabra "fizz".
         * 
         * Múltiplos de 5 por la palabra "buzz".
         * 
         * Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
         * 
         */

        for (int i = 1; i <= 100; i = i++) {

            boolean multiploDe3 = (i % 3 == 0);
            boolean multiploDe5 = (i % 5 == 0);
            
            if (multiploDe5 && multiploDe3) {
                System.out.println("fizzbuzz");

            } else if (multiploDe5) {
                System.out.println("buzz");
            } else if (multiploDe3) {
                System.out.println("fizz");

            } else {
                System.out.println(i);
            }
        }
    }
}