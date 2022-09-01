public class Aluno
{
    String nome;
    int idade;
    String matricula;
    int periodo;
    boolean aprovado;

    void mostraInfo()
    {
        System.out.println("Nome aluno: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Periodo: " + this.periodo);
        System.out.println("Aprovado: " + this.aprovado );
    }

    public Aluno()
    {

    }

    // Construtor por parâmetro
    public Aluno(String nome, int idade, String matricula, int periodo, boolean aprovado)
    {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.periodo = periodo;
        this.aprovado = aprovado;
    }

}
