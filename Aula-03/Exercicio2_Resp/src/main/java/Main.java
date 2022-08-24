public class Main
{
    public static void main(String[] args)
    {
        // Objeto 1 - metodo 1
        Carro c1 = new Carro("Preto","Volkswagen","Fox",
                200,100,new Motor(50,"Flex"));

        // Objeto 2 - metodo 2
        Motor m1 = new Motor(40,"Gasolina");
        Carro c2 = new Carro("Vermelho","Fiat", "Uno",
                160,90,m1);

        // Chamando métodos
        c1.mostraInfo();
        c2.mostraInfo();

    }
}