import java.util.Scanner;
public class a001 {
    public static void main(String[] args) {
        int maior = 0, num = 0, cont = 1;
        Scanner input = new Scanner(System.in);
        while ( cont <= 3 ) {
            System.out.println("Informe um n�mero: ");
            num = input.nextInt();
            if ( num > maior ) {
                maior = num;
            }
            cont += 1;
        }
        System.out.println("O maior n�mero informado foi: " + maior);
    }
}