import java.util.*;
public class a004 {
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		Random numeros = new Random();
		String[] papado = new String[ 3 ];
		for ( int i = 0; i <= 3; i++ ) {
			if ( i < 3 ){
				System.out.print( 
					"Informe o nome do Papa: " );
				String papa = input.nextLine();
				papado[ i ] = papa;
			} else {
				String decisao;
				int escolhido = 0 + numeros.nextInt( 3 );
				do {
					System.out.print( 
						"\n" + papado[ escolhido ] + " foi " +
						"escolhido como novo Papa!\nVocê aceita" +
						" esse Papa? Digite (S/N): " );
					decisao = input.next();
				} while ( !decisao.equalsIgnoreCase( "S" ) 
						&& !decisao.equalsIgnoreCase( "N" ) );
				if ( decisao.equalsIgnoreCase( "S" ) ){
					System.out.println(  
						"\n" + papado[ escolhido ] + 
						" é o novo Papa!" );
				} else {
					int num = 0;
					do {
					try {
						System.out.printf( 
							"\nEscolha o Papa, informando um dos " +
							"valores abaixo:\n\n1 - " + papado[ 0 ] + 
							"\n2 - " + papado[ 1 ] + 
							"\n3 - " + papado[ 2 ] +
							"\n\nInforme um valor da lista: " );
						num = input.nextInt();
						} catch ( InputMismatchException 
							inputMismatchException  ) {
							System.err.printf( "\nException: %s\n", 
								inputMismatchException );
							input.nextLine();
							System.out.printf(
								"Você deve digitar números inteiros. " +
								"Por favor, tente novamente:\n");					
						}
					} while ( num < 1 || num > 3 );
					System.out.println(  
						"\n" + papado[ num - 1 ] +
						" é o novo Papa!" );
				}
			}
		}
	}
}