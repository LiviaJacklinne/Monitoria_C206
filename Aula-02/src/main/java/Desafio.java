import java.util.Random; // Biblioteca Random

public class Desafio
{
    public static void main(String[] args)
    {
        // variavel auxiliar
        int num;
        // instanciando a classe Random para usar o método
        Random random = new Random();

        // Um for de 3, pois são 3 numeros aleatórios
        for (int i = 0; i < 3; i++)
        {
            // numero aleatorio sendo gerado em um intervalo de 100
            num = random.nextInt(100);

            // Verificação se o numero é par ou impar
            if(num % 2 == 0)
                System.out.println("O numero " + num + " e par" );
            else
                System.out.println("O numero " + num + " e impar" );

        }
    }
}
