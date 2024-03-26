package questões;

public class Questao5 {
    public Questao5(String string) {
        this.string = string;
    }
    public String string;
    public void resposta5() {
        char[] caracteres = string.toCharArray();
        int tamanho = caracteres.length;
        String invertida = "";
        for (int i = tamanho - 1; i >= 0; i--) {
            invertida += caracteres[i];
        }
        System.out.println(invertida);
    }
}
