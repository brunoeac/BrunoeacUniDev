import java.util.*;
public class a005_2 {
    public static void main(String[] args) {
        List< Integer > lista = new ArrayList< Integer >();
        Scanner input = new Scanner( System.in );
        int aux = 1, num = 0;
        while ( aux < 4 ) {
            try {
                System.out.print( "Informe um valor inteiro: " );
                num = input.nextInt();
                lista.add( num );
            } catch ( InputMismatchException ime ) {
                System.err.printf( "\nExceção: %s", ime );
                input.nextLine();
                aux--;
                System.out.printf(
                    "\nInforme somente números inteiros!\n" +
                    "Por favor, tente novamente:\n\n" );
            }
            aux++;
        }
        Collections.sort( lista );
        System.out.println( "\nExibe a lista em ordem crescente:\n" );
        for ( Integer i : lista )
            System.out.printf( "%d ", i );
    }
}