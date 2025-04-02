import java.util.Random;
import java.util.Scanner;

public class Senha {

    private static int senhaAtual; // atributo de classe
    private static int minhaSenha; // atributo de instancia

    public Senha() {
        senhaAtual = new Random().nextInt(1000);
        minhaSenha = senhaAtual;
    } 

    public static int getMinhaSenha() {
        return minhaSenha;
    }

    public static int getSenhaAtual() {
        return senhaAtual;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o tamanho do vetor de senhas:\n");
        int tam = scanner.nextInt();

        Senha[] senhas = new Senha[tam];
        
        for (int i = 0; i < tam; i++) {
            senhas[i] = new Senha();
        }
        
        for (Senha senha : senhas) {
            System.out.printf("Senha: %d\n", senha.getMinhaSenha());
        }
        scanner.close();
    }   
}
