import java.util.Scanner;
public class a003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "Informe um valor entre 1 e 10:" );
        int num = input.nextInt();
        while ( num < 1 || num > 10 ) {
            System.out.println(
                "Entrada Inválida! Informe um valor entre 1 e 10:" );
            num = input.nextInt();
        }
        System.out.printf( "Exibe o número %d por %d vezes:\n",
            num, num );
        for ( int i = 1; i <= num; i++ )
            System.out.printf( "%d\n", num );
    }
}