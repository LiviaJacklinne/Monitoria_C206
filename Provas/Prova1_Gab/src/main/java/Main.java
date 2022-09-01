import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Faculdade faculdade = new Faculdade();

        System.out.print("Digite o nome da faculdade: ");
        faculdade.nome = sc.nextLine();
        System.out.print("Digite o CNPJ: ");
        faculdade.CNPJ = sc.nextInt();

        boolean aux = true;

        do
        {
            System.out.println("0 - Para sair");
            System.out.println("1 - Para adicionar aluno");
            System.out.println("2 - Ver quantidade de aluno P5+");
            System.out.println("3 - Ver a media de alunos aprovados");
            System.out.println("4 - Ver info");
            System.out.println("Digite o que deseja fazer: ");

            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu)
            {
                case 0:
                    System.out.println("Voce saiu!");
                    aux = false;
                    break;

                case 1:
                    Aluno aluno = new Aluno();
                    System.out.print("Nome do aluno: ");
                    aluno.nome = sc.nextLine();
                    System.out.print("Idade: ");
                    aluno.idade = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Matricula: ");
                    aluno.matricula = sc.nextLine();
                    System.out.println("Periodo: ");
                    aluno.periodo = sc.nextInt();
                    System.out.println("Aprovado? ");
                    aluno.aprovado = sc.hasNextBoolean();
                    faculdade.addAluno(aluno);
                    System.out.println("Aluno adicionado!\n");
                    break;

                case 2:
                    faculdade.alunoSuperiorP5();
                    break;

                case 3:
                    faculdade.mediaAprovacao();
                    break;

                case 4:
                    aluno.mostraInfo();




            }

        } while (aux);





        sc.close();
    }
}
