import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco(); 

        System.out.print("Digite o nome do banco: ");
        banco.nomeBanco = sc.nextLine();
        System.out.println(" ");

        boolean aux = true;
        int menu;
        // Menu
        do
        {

            System.out.println("0 - Sair");
            System.out.println("1 - Adicionar Conta");
            System.out.println("2 - Mostrar Contas");
            System.out.println("O que deseja fazer?");
            menu = sc.nextInt(); // Entrada de dado de um inteiro
            sc.nextLine(); // O dado anterior é int, e o próximo é String
            // Precisamos fazer uma quebra de linha para (tipo cin.ignore())

            System.out.println(" ");
            switch (menu)
            {
                case 0:
                    aux = false;
                    System.out.println("Voce saiu");

                    break;

                case 1:
                    // Instanciando uma conta
                    Conta conta = new Conta();
                    System.out.print("Nome do usuario: ");
                    conta.nomeUsuario = sc.nextLine();
                    System.out.print("Saldo: ");
                    conta.saldo = sc.nextFloat();
                    banco.addConta(conta);
                    System.out.println("Conta Adicionada\n");
                    break;

                case 2:
                    banco.mostraInfo();

                    break;

                default:
                    System.out.println("Opcao invalida, tente novamente.\n");
                    break;

            }


        } while (!(!aux)); // aux == false

        sc.close();
    }
}
