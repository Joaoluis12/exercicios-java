import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static void imprimir(String texto) {
        System.out.println(texto);
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Par ou Impar
        /*     int num;
        imprimir("Digite um numero: ");
        num = scan.nextInt();
        String result = num%2==0 ? "Número Par" : "Número Impar";
        imprimir(result); */
    
        // Maior e média
        /* int num;
        int maior = 0;
        int soma = 0;
        int i = 0;

        do{
            System.out.println("Digite um número:");
            num = scan.nextInt();
            if(num > maior) maior = num;
            
            soma += num;
            i++;

        }while(i < 5);
        float media = (soma / 5);
        imprimir("Maior número: " + maior);
        imprimir("Soma: " + soma);
        imprimir("Média: " + media); */    
    
        // Tabuada
        /* System.out.print("Digite a tabuada desejada: ");
        int num = scan.nextInt();

        imprimir("---- Tabuada de " + num + " ----");
        for(int i=1; i<=10; i++){
            imprimir("=> " + num + " x " + i + " = " + num*i);
        } */
    
        // Fatorial
        /* System.out.print("Digite o numero a ser Fatorado: ");
        int num = scan.nextInt();
        int resul = num;
        for(int i = (num-1); i>=1; i--){
            resul *= i;
        }
        imprimir("Resultado de " + num + "! é: " + resul); */

        // Numeros aleatórios
        Random random = new Random();

        int[] randomNumbers = new int[20];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100);
        }

        imprimir("Numeros aleatórios");
        for (int num: randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nAntecessores");
        for (int num: randomNumbers) {
            System.out.print((num-1) + " ");
        }


        // Array Bidimensional

        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(9);
            }
        }

        System.out.println("\nMatriz montada");
        for (int[] linha: matriz) {
            for (int coluna: linha) {
                System.out.print(coluna + " ");
            }
            System.out.println("");
        }



    
    
    }
}



