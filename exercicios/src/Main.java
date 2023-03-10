import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner ler = new Scanner(System.in);
        imprimir("Digite um numero: ");
        num = ler.nextInt();
        String result = num%2==0 ? "Número Par" : "Número Impar";
        imprimir(result);
    }

    public static void imprimir(String texto) {
        System.out.println(texto);
    }
}



