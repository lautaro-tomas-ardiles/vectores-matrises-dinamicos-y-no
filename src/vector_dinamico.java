import java.util.Scanner;
public class vector_dinamico {
    public static void main(String args[]) {

        int longitud;

        Scanner in = new Scanner(System.in);

        System.out.print("¿ que cantided de vectoros quieres que alla ? : ");
        longitud = in.nextInt();

        int numeros[] = new int[longitud];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("dame un numero : ");
            numeros[i] = in.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + numeros[i] + "]");
        }
    }
}