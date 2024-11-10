import java.util.Scanner;
public class vector_dinamico_vercion_2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int longitud;

        System.out.print("¿ que cantided de vectoros quieres que alla ? : ");
        longitud = in.nextInt();

        int numeros[] = new  int[longitud];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("dame un numero : ");
            numeros[i] = in.nextInt();
        }
        for (int n: numeros){
            System.out.print("[" + n + "]");
        }
    }
}
