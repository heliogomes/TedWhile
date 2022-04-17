import java.util.Random;
import java.util.Scanner;

public class TedWhile {

    public static void main (String[] args) {
        Random random = new Random();
        int number = random.nextInt(10);
        System.out.println(number);
        System.out.print("Informe um número de 1 a 10: ");

        Scanner sc = new Scanner(System.in);

        int numberUser = sc.nextInt();
        int count = 1;
        while(numberUser!= number){
            if(numberUser>number){
                System.out.print("Errou! Tente um número menor: ");
                numberUser = sc.nextInt();
            } else {
                System.out.print("Errou! Tente um número maior: ");
                numberUser = sc.nextInt();
            }
            count++;
        }
        System.out.println(("Parabéns! Você acertou em " + count + " tentativas."));
    }
}
