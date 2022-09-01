public class Faculdade
{
    String nome;
    int CNPJ;
    Aluno[] aluno;

    void addAluno(Aluno auxAluno)
    {
        for (int i=0; i<aluno.length; i++)
        {
            if(aluno[i] == null)
            {
                aluno[i] = auxAluno;

                break;
            }
        }
    }

    void alunoSuperiorP5()
    {
        int x;
        for (int i = 0; i<aluno.length; i++)
        {
            if(aluno[i] != null)
            {
                if (aluno[i].periodo >= 5)
                {
                    x++;
                }
            }
        }
        System.out.println(x + " alunos são P5+");
    }

    float mediaAprovacao()
    {
        int x, y; // variaveis contadoras auxiliares

        for (int i = 0; i < aluno.length; i++)
        {
            if (aluno[i] != null)
            {
                // Contanto o total de alunos
                y++;

                if (aluno[i].aprovado)
                {
                    // contando os alunos aprovados
                    x++;
                }
            }
        }
    }


}
