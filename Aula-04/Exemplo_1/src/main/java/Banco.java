public class Banco
{
    String nomeBanco;
    Conta [] conta = new Conta[20]; // Criando um array de 20 posições

    void addConta(Conta contaNova)
    {
        for (int i = 0; i < conta.length; i++)
        {
            // Se a posição do array estiver null, vai adicionar uma nova conta
            if(conta[i] == null)
            {
                conta[i] = contaNova;

                // o break é usado para "quebrar" o código
                break;
            }
        }
    }

    void mostraInfo()
    {
        System.out.println("Nome do banco: " + this.nomeBanco);
        for (int i = 0; i< conta.length; i++)
        {
            if(conta[i] != null)
            {
                conta[i].mostraInfo();
            }
        }

        System.out.println(" ");
    }

}
