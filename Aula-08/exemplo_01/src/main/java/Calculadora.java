public class Calculadora
{
    public static double PI = 3.14;

    public static double raio(Double raio_aux)
    {
        System.out.println(2* raio_aux *PI);

        return 0;
    }

    public static double volume (double raio_aux)
    {
        System.out.println(Math.pow(raio_aux,3) * (4/3) * PI);

        return 0;
    }

}
