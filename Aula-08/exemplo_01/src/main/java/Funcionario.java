public abstract class Funcionario
{
    private String nome;
    private int idade;
    private double salario;

    public void mostraInfo()
    {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salario: " + this.salario);
    }

    public void fazAlgo()
    {
        System.out.println(this.nome + " esta fazendo algo");
    }

    public Funcionario(String nome, int idade, double salario)
    {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    // GETTERS E SETTER
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}
    public double getSalario() {return salario;}
    public void setSalario(double salario) {this.salario = salario;}


}
