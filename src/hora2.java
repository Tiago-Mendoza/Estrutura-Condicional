import java.util.Scanner;
public class hora2 {
    public static void main (String[] args){


        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Que horas são ?");
        hora = sc.nextInt();

        if(hora < 12){
            System.out.println("Ainda não passou de meio dia então Bom dia ");
        }
        else if(hora < 18){
                System.out.println("Ainda não são 18h, então Boa tarde");
         }
         else{
                System.out.println("Boa noite");
        }

        

        

        sc.close();
    }
}
