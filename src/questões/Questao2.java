package questões;

import java.util.Scanner;

public class Questao2 {

    public Questao2(int numero) {
        this.numero = numero;
    }

    public int numero;
    public void resposta2(){
        if (verificarFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

    private static boolean verificarFibonacci(int numero) {
            int a = 0;
            int b = 1;

            if (numero == a || numero == b) {
                return true;
            }

            int c = a + b;
            while (c <= numero) {
                if (c == numero) {
                    return true;
                }
                a = b;
                b = c;
                c = a + b;
            }
            return false;
    }
}
