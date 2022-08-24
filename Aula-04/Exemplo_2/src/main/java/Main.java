import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Ponteiros que guardam ref de memória
        Conta[] conta = new Conta[5];

        // Método 1 - Adicionando dados por construtor SEM parametro
        Conta c1; // Espaço alocado na memória, c1 aponta para um endereço
        c1 = new Conta(); // Instanciando Conta, criando um objeto
        c1.nome = "Pedro";
        c1.saldo = 500;

        // Método 2 - Adicionando dados com costrutor COM parametro
        Conta c2 = new Conta("Livia",1000);

        // Adicionando os dados no array
        conta[0] = c1;
        conta[1] = c2;

        // Método 3 - Adicionando os parametros direto no array
        conta[2] = new Conta();
        conta[2].nome = "Juca";
        conta[2].saldo = 300;

        // For para ler o array
        for(int i = 0; i < conta.length; i++)
        {
            // Verificação se a posição do array não é null
            if(conta[i] != null)
            {
                System.out.println("Nome: " + conta[i].nome);
                System.out.println("Conta Saldo " + i + ": " + conta[i].saldo);
            }

        }

    }
}
