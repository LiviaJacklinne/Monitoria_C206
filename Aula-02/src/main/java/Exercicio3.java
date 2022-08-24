import java.util.Scanner;

public class Exercicio3
{
    public static void main(String[] args)
    {
        // Entrada de dados
        Scanner sc = new Scanner(System.in);
        int x;
        float raio, base, altura;

        // Menu
        System.out.println("Qual area voce deseja calcular?");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Triangulo");
        System.out.println("3 - Circulo");

        x = sc.nextInt();

        switch (x)
        {
            // Quadrado
            case 1:
                System.out.print("Digite o valor da base e da altura: ");
                base = sc.nextFloat();
                altura = sc.nextFloat();
                System.out.println("Area: " + base*altura);
                break;

            // Triangulo
            case 2:
                System.out.print("Digite o valor da base e da altura: ");
                base = sc.nextFloat();
                altura = sc.nextFloat();
                System.out.println("Area: " + (base*altura)/2);
                break;

            // Circulo 
            case 3:
                System.out.print("Digite o valor do raio: ");
                raio = sc.nextFloat();
                System.out.println("Area: " + Math.pow(raio,2) * 3.14);
                break;

            default:
                System.out.println("Opcao invalida");

        }
        // Fechando entrada de dados
        sc.close();
    }
}
