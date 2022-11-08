public class Thread_Implements extends Thread implements Runnable, Tipo
{
    // Nome da Thread
    public String nome;

    public Thread_Implements(String nome)
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
