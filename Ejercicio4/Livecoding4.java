package Ejercicio4; // nombre de la carpeta a la que pertenece

// Clase principal que contiene main()
public class Livecoding4 {

    // Método main()
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();

        fb.calcularMult();
    } // main
}// class

// Clase para calcular múltiplos de 5 y 3 entre 1 - 100
class FizzBuzz {
    // se declaran atributos
    int n = 0;

    // constructor
    public FizzBuzz() {
        this.n = 0;
    }

    // Método para imprimir resultados
    public void calcularMult() {
        // ciclo para imprimir del 1 al 100
        do {
            this.n++;

            // Numero es múltiplo de 3 y 5
            if (this.n % 3 == 0 && this.n % 5 == 0) { 
                System.out.println("FizzBuzz");
                continue;

                // Numero es múltiplo de 3
            } else if (this.n % 3 == 0) {
                System.out.println("Fizz");
                continue;

                // Numero es múltiplo de 5
            } else if (this.n % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }

            // Imprime números que no son múltiplos de 3 o 5
            System.out.println(n);

        } while (n < 100); // do while
    } // método calcularMult()
} // class