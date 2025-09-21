import java.util.Scanner;
public class ex2 {
    public static void main(String[]args){
        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
        Scanner sc = new Scanner (System.in);
        int N;
        System.out.println("Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar");
        N = sc.nextInt();
        if(N % 2 == 0 ){
            System.out.println("PAR");
        }
        else{
            System.out.println("IMPAR");
        }




        sc.close();
    }
}
