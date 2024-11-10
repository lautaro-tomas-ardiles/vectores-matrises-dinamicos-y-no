import java.util.Scanner;
public class matris_dinamica {
    public static void main (String args[]) {

        Scanner in = new Scanner(System.in);
        int rows, column, accountant = 0 ;

        System.out.print("¿ cuantas filas queres ? : ");
        rows = in.nextInt();

        System.out.print("¿ cuantas column queres ? : ");
        column = in.nextInt();

        int numbers [][] = new int [rows][column] ;

            for (int j = 0 ; j < rows ; j++ ){
                for (int i = 0 ; i < column ; i++ ){

                numbers[j][i] = accountant;
                accountant++;
                System.out.print("[" + numbers[j][i] + "]");
            }
          System.out.println(" ");
        }
    }
}