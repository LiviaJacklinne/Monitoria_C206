public class Main
{
    public static void main(String[] args)
    {
        /*
            Em Java tem duas formas de criar uma Thread
            1) extends Thread
            2) implemnents Runnable
         */

        Threads_Extends te1 = new Threads_Extends("THREAD 1");
        Threads_Extends te2 = new Threads_Extends("THREAD 2");
        Threads_Extends te3 = new Threads_Extends("THREAD 2");

        // Vamos chamar o metodo para iniciar as THREADS
        te1.start();
        te2.start();
        te3.start();


        Threads_Extends ti1 = new Threads_Extends("THREAD 1");
        Threads_Extends ti2 = new Threads_Extends("THREAD 2");
        Threads_Extends ti3 = new Threads_Extends("THREAD 2");

        Thread t1 = new Thread(ti1);
        Thread t2 = new Thread(ti2);
        Thread t3 = new Thread(ti3);

        // Vamos chamar o metodo para iniciar as THREADS
        ti1.start();
        ti2.start();
        ti3.start();



    }
}
