public class Produto
{
    public String nome;
    public String descricao;
    public String fabricante;
    public double preco;

    // Construtor por parametro
    public Produto(String nome, String descricao, String fabricante, double preco)
    {
        this.nome = nome;
        this.descricao = descricao;
        this.fabricante = fabricante;
        this.preco = preco;
    }
}