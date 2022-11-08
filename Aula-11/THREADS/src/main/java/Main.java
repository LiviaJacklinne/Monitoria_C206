public class Main
{
    public static void main(String[] args)
    {
        /*
            Quais as duas formas de criar uma THREAD
            1) extends Thread
            2) implents Runnable
         */

        Thread_Implements ti1 = new Thread_Implements("THREAD 1");
        Thread_Implements ti2 = new Thread_Implements("THREAD 2");
        Thread_Implements ti3 = new Thread_Implements("THREAD 3");

        Thread t1 = new Thread(ti1);
        Thread t2 = new Thread(ti2);
        Thread t3 = new Thread(ti3);

        t1.start();
        t2.start();
        t3.start();


//        Thread_Extends te1 = new Thread_Extends("THREAD 1");
//        Thread_Extends te2 = new Thread_Extends("THREAD 2");
//        Thread_Extends te3 = new Thread_Extends("THREAD 3");
//
//        te1.start();
//        te2.start();
//        te3.start();

    }
}
