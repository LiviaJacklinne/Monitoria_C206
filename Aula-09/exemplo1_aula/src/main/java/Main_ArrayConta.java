import java.util.ArrayList;
import java.util.Collections;

public class Main_ArrayConta
{
    public static void main(String[] args)
    {
        ArrayList<Conta> contas = new ArrayList<>();

        Conta c1 = new Conta("Joe",100);
        Conta c2 = new Conta("Mike", 55);
        Conta c3 = new Conta("Anne", 70);
        Conta c4 = new Conta("Hanna",10);

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);
        contas.add(c4);

        // Não faz muito sentido, pois vai mostrar só os endereços
       // System.out.println(contas);


        // System.out.println("Sem ordenar ");
        for (int i=0; i<contas.size(); i++)
        {
            System.out.println("Nome: " + contas.get(i).nome);
            System.out.println("Saldo: " + contas.get(i).saldo);
            System.out.println(" ");
        }

        // tem que implementar na classe Conta
       Collections.sort(contas);


         System.out.println("Apos ordenação ");
        for (int i=0; i<contas.size(); i++)
        {
            System.out.println("Nome: " + contas.get(i).nome);
            System.out.println("Saldo: " + contas.get(i).saldo);
        }



    }
}
