import java.util.Scanner;
public class a002 {
    public static void main(String[] args) {
        int cont = 1, aux = 0;
        Scanner input = new Scanner(System.in);
        while ( cont <= 8 ) {
            System.out.println( "Informe um número:" );
            int num = input.nextInt();
            cont++;
            if ( num > 4 )
                aux++;
        }
        System.out.printf(
            "A quantidade de números maiores que 4 é %d."
            , aux );
    }
}