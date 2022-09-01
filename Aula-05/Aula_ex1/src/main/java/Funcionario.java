public class Funcionario
{
    private String nome;
    private int id;
    private static int cont = 0;

    public Funcionario()
    {
        // Cont está sendo incrementado toda vez que um objeto
        // é criado
        cont++;
        id = cont;
    }

    public void mostraInfo()
    {
        System.out.println("Nome: " + nome);
        System.out.println("Id: " + id);
    }

    // GETTERS e SETTER
    public static int getCont() {return cont;}
    public static void setCont(int cont) {  Funcionario.cont = cont;}
    public String getNome() { return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    /* OBS: quando o metodo for estatico, seu GET/SET vai ser estatico
    também.
     */
}
