import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int entrada = scanner.nextInt();
        int total = 0;
        while( entrada % 2 == 0 ){
            total = total + entrada;
            System.out.print("Dame un numero: ");
            entrada = scanner.nextInt();
        }
        System.out.println("La suma total es ["+total+"]");

    }
}