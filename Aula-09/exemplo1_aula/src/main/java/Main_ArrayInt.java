import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main_ArrayInt
{
    public static void main(String[] args)
    {

        ArrayList<Integer> inteiros = new ArrayList<>();

        inteiros.add(50);
        inteiros.add(10);
        inteiros.add(3);
        inteiros.add(18);
        inteiros.add(40);
        inteiros.add(37);

        System.out.println("Array sem ordenar");
        System.out.println(inteiros);
        System.out.println("\n");

        System.out.println("Array ordenado");
        Collections.sort(inteiros);
        System.out.println("\n");

        System.out.println("Array decrescente");
        Collections.reverse(inteiros);
        System.out.println("\n");

        /*

        // Ele retorna a posição do elemento escolhido
        System.out.println(inteiros.indexOf(18));

        // Verifica se tem elementos na lista true(vazio) or false
        System.out.println(inteiros.isEmpty());

        // Limpa a lista
        inteiros.clear();

         */

    }
}
