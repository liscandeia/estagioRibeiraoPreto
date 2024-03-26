package questões;

public class Questao3 {
    public void resposta3() {
        //a) 1, 3, 5, 7, ___9
        System.out.println("Sequência a):");
        for (int i = 1; i <= 10; i += 2) {
            if (i == 9) {
                System.out.println("resposta: " + i);
                break;
            }
            System.out.print(i + ", ");

        }

        //b) 2, 4, 8, 16, 32, 64, ____128
        System.out.println("Sequência b):");
        int numB = 2;
        for (int i = 0; i < 10; i++) {
            System.out.print(numB + ", ");
            numB *= 2;
            if (numB == 128) {
                System.out.println("resposta: " + numB);
                break;
            }
        }

        //c) 0, 1, 4, 9, 16, 25, 36, ____49
        System.out.println("Sequência c):");
        for (int i = 0; i <= 10; i++) {
            int valor = i * i;
            if (valor == 49) {
                System.out.println("resposta: " + valor);
                break;
            }
            System.out.print(valor + ", ");

        }
        //d) 4, 16, 36, 64, ____100
        System.out.println("Sequência d):");
        for (int i = 2; i <= 10; i += 2) {
            int valor = i * i;
            if (valor == 100) {
                System.out.println("resposta: " + valor);
                break;
            }
            System.out.print(valor + ", ");

        }

        //e) 1, 1, 2, 3, 5, 8, ____13
        System.out.println("Sequência e):");
        int fib1 = 1, fib2 = 1, nextFib;
        System.out.print(fib1 + ", " + fib2 + ", ");
        for (int i = 2; i < 10; i++) {
            nextFib = fib1 + fib2;
            if (nextFib == 13) {
                System.out.println("resposta: " + nextFib);
                break;
            }
            System.out.print(nextFib + ", ");
            fib1 = fib2;
            fib2 = nextFib;

        }

        //f) 2,10, 12, 16, 17, 18, 19, ____20
        System.out.println("Sequência f):");
        System.out.println("2,10, 12, 16, 17, 18, 19, resposta: 200");
    }
}


