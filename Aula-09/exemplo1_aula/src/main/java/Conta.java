public class Conta //implements Comparable<Conta>
{
    public int saldo;
    public String nome;

    // Construtor
    public Conta()
    {

    }
    // Construtor
    public Conta(String nome,int saldo)
    {
        this.nome = nome;
        this.saldo = saldo;
    }

    /*
    @Override
    public int compareTo(Conta c) {
        return Integer.compare(this.saldo, c.saldo);
    }

    @Override
    public int compareTo(Conta c) {
        return dono.compareTo(c.dono);
    }

     */
}
