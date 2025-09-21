import java.util.Scanner;
public class ex1 {
    public static void main(String[] args){


    //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
    // Exemplos:
    //Entrada:          Saída:
    //-10               NEGATIVO
    //Entrada:          Saída:
    //8                 NAO NEGATIVO
    //Entrada:          Saída:
    //0                 NAO NEGATIVO
        Scanner sc = new Scanner (System.in);
        int numero;

        System.out.println("Digite um numero inteiro");
        numero = sc.nextInt();

        if(numero > 0){
            System.out.println("Não negativo");
        }
        else{
            System.out.println("Negativo");

        }



        sc.close();
    }
}
