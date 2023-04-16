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
    
    
    
    }
}



