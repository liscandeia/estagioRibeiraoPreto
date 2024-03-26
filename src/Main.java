import questões.*;

public class Main {
    public static void main(String[] args) {
        Questao1 questao1 = new Questao1();
        questao1.resposta1();
        //soma = 91

        Questao2 questao2 = new Questao2(15);
        questao2.resposta2();
        //escolha o número passando para o construtor

        Questao3 questao3= new Questao3();
        questao3.resposta3();
        //a resposta da f nao fiz conta pois são números que começam com d

        Questao5 questao5 = new Questao5("Lis");
        questao5.resposta5();

        Questao4 questao4 = new Questao4();
        questao4.resposta4();
        //questao com resposta printada, sem contas
    }
}