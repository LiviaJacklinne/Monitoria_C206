import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class ArquivoTeste
{
    public void escrever()
    {

        // Declarando as variaveis
        OutputStream os = null; // Saida de dados
        OutputStreamWriter osw = null; // Escrita para saida de dados
        BufferedWriter bw = null; // Variavel que guarda os dados para escrever (buffer)
        String linhaEscrever = null;

        try
        {
            // Instanciando as variaveis
            // nome do arquivo + false (escreve no txt)/ true (sobreescreve no txt)
            os = new FileOutputStream("Arquivo1.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);


            linhaEscrever = "Java é legal!";
            bw.write(linhaEscrever);


        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

