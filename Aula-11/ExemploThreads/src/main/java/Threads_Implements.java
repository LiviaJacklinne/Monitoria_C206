public class Threads_Implements implements Runnable
{
    public String nome;

    // Construtor da classe
    public Threads_Implements(String nome)
    {
        this.nome = nome;
    }

    public void run()
    {
        for(int i=0; i<10; i++)
        {
            System.out.println(nome + " - " + i);

            //Delay de 2s
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
