public class Professor extends Funcionario
{
    private String materia;

    public void corrigirProvas()
    {
        System.out.println("O professor " + this.getNome() + " esta corrigindo provas");
    }

    @Override
    public void mostraInfo()
    {
        super.mostraInfo();
        System.out.println("Materia: " + materia);
    }

    @Override
    public void fazAlgo()
    {
        System.out.println(this.getNome() + " esta dando aula");
    }

    public Professor(String nome, int idade, double salario, String materia) {
        super(nome, idade, salario);
        this.materia = materia;
    }
}
