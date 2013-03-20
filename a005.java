import java.util.Scanner;
public class a005 {
    public static void main(String[] args) {
        int menor = 0, maior = 0, segundoMaior = 0, cont = 1, num = 0;
        Scanner input = new Scanner(System.in);
        while ( cont <= 3 ) {
            System.out.println("Informe um número:");
            num = input.nextInt();
            if ( num > maior ) {
                menor = segundoMaior;
                segundoMaior = maior;
                maior = num;
            } else if ( num > segundoMaior ) {
                menor = segundoMaior;
                segundoMaior = num;
            } else if ( num > menor ) {
                menor = num;
            }
            cont++;
        }
        System.out.printf( "\nOrdem Crescente:\n%d\n%d\n%d\n",
            menor, segundoMaior, maior );
    }
}