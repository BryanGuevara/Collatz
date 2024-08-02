package conjetura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Collatz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int paso = 1;

        try {
            System.out.println("=================================================== <[Entrada]> =================================================");
            System.out.print("Escriba un numero: ");
            int num = scan.nextInt();

            if (num > 1) {
                System.out.println("=================================================== <[Conjetura]> ================================================");
                while (num != 1) {
                    if (num % 2 == 0) {
                        System.out.print(paso + " Par   - " + num + "/2=");
                        num = num / 2;
                    } else {
                        System.out.print(paso + " Impar - " + num + "X3+1=");
                        num = (num * 3) + 1;
                    }

                    System.out.println(num);

                    paso++;
                }
                System.out.println("==================================================================================================================");
            } else {
                System.out.println("=================================================== <[Error]> ====================================================");
                System.err.println("Error, Solo numeros superiores a 1");
                System.out.println("==================================================================================================================");
            }

        } catch (InputMismatchException e) {
            System.out.println("=================================================== <[Error]> ====================================================");
            System.err.println("Error, solo se admiten numeros");
            System.out.println("==================================================================================================================");
        }
    }
}
