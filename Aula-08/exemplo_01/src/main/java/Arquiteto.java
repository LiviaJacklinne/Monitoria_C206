public class Arquiteto extends Funcionario
{
    private String especialidade;

    @Override
    public void mostraInfo()
    {
        super.mostraInfo();
        System.out.println("Especialidade: " + this.especialidade);
    }

    /*@Override
    public void fazAlgo()
    {
        System.out.println(this.getNome() + " esta fazendo uma planta");
    }*/

    public Arquiteto(String nome, int idade, double salario, String especialidade)
    {
        super(nome, idade, salario);
        this.especialidade = especialidade;
    }
}
