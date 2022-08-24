import java.util.Scanner;

public class Exercicio2
{
    public static void main(String[] args)
    {
        // Entrada de dados
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite um número inteiro: ");
        num = sc.nextInt();

        if(num == 1)
            System.out.println("Pedra");
        else if(num == 2)
            System.out.println("Papel");
        else if (num == 3)
            System.out.println("Tesoura");
        else
            System.out.println("Null");

        // Fechando entrada de dados
        sc.close();
    }
}
