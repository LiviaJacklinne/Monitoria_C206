public class Conta
{
    String nome;
    float saldo;

    // Construtor sem parâmetro
    Conta()
    {

    }

    // Sobrecarga de construtor; Construtor por parametro
    Conta(String nome, float saldo)
    {
        this.nome = nome;
        this.saldo = saldo;
    }

}
