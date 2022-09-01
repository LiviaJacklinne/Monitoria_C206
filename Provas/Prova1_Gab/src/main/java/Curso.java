public class Curso
{
    String nome;
    String sigla;

    void alunoMatriculado()
    {
        System.out.println("Aluno Matriculado");
    }

    void mostraInfo()
    {
        System.out.println("Nome do curso: " + this.nome);
        System.out.println("Sigla do curso: " + this.sigla);
    }
}
