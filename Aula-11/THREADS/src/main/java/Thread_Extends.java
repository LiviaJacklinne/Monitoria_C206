public class Thread_Extends extends Thread
{
    // Nome da Thread
    public String nome;

    public Thread_Extends(String nome)
    {
        this.nome = nome;
    }


    public void run()
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(nome + " - " + i);

            // Delay de 1s
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
