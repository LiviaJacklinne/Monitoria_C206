public class Main
{
    public static void main(String[] args)
    {
        Funcionario f1 = new Funcionario();

        f1.setNome("Livia");

        System.out.println("Contador: " + Funcionario.getCont());
        f1.mostraInfo();



    }
}
