import java.util.Scanner;

public class Exercicio1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;

        // Sai do loop quando num for igual a 7
        do
        {
            // entrada de dados
            System.out.print("Digite um numero de 0 a 10: ");
            num = sc.nextInt();

            // Se num for igual a 7
            if(num == 7)
                System.out.println("Numero correto!");

            // Se num for maior que 10 ou menor que 0
            else if (num > 10 || num < 0)
                // \n serve para pular linha
                System.out.println("Numero invalido\n");

            else
                // \n serve para pular linha
                System.out.println("Numero incorreto\n");

        } while(!(num == 7));

        sc.close();

    }
}
