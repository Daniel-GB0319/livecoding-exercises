package Ejercicio3;
import java.util.Scanner;

// Clase MangosNaranjas
class MangosNaranjas {
    private int mangos;
    private int naranjas;

    // Constructor
    public MangosNaranjas(int mangos, int naranjas) {
        this.mangos = mangos;
        this.naranjas = naranjas;
    } // constructor

    // Método para calcular el máximo común divisor
    private int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    } // método máximo común divisor

    // Método para imprimir los resultados
    public void imprimir() {
        int cajas = mcd(this.mangos, this.naranjas);
        System.out.println("El número de cajas es: " + cajas);
        System.out.println("El número de mangos en una caja es: " + this.mangos / cajas);
        System.out.println("El número de naranjas en una caja es: " + this.naranjas / cajas);
    } // método imprimir
}// class mangos y naranjas

// Clase Main
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduce el número de mangos:");
            int mangos = scanner.nextInt();
            System.out.println("Introduce el número de naranjas:");
            int naranjas = scanner.nextInt();
            MangosNaranjas mn = new MangosNaranjas(mangos, naranjas);
            mn.imprimir();
        } // try scanner
    } // método main
} // class main
