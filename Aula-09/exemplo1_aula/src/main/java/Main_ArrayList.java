import java.util.ArrayList;

public class Main_ArrayList
{
    public static void main(String[] args)
    {
        // lista genérica
        ArrayList lista = new ArrayList();

        // função para adicionar itens na lista
        lista.add("Kadu");
        lista.add(2022);
        lista.add(true);

        System.out.println(lista);

        //lista.remove(0);

        // função size, vai ler todas as posições do ArrayList
        for(int i=0; i < lista.size(); i++)
        {
            // vamos usar get(i), inves de lista[i]
            System.out.println(lista.get(i));
        }

    }
}
