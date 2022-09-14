public class Engenheiro extends Funcionario
{
    private String ramo;

    @Override
    public void mostraInfo()
    {
        super.mostraInfo();
        System.out.println("Ramo: " + this.ramo);
    }

    @Override
    public void fazAlgo()
    {
        System.out.println(this.getNome() + " esta fazendo um codigo");
    }

    public Engenheiro(String nome, int idade, double salario, String ramo)
    {
        super(nome, idade, salario);
        this.ramo = ramo;
    }
}
