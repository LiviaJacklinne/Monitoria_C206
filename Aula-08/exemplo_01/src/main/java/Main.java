public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[5];

        Professor professor = new Professor("Chris", 30, 2000, "C206");
        Engenheiro engenheiro = new Engenheiro("Chaves", 20, 1000, "Computacao");
        Arquiteto arquiteto = new Arquiteto("Maria", 22, 1000, "Decoracao");

        funcionarios[0] = professor;
        funcionarios[1] = engenheiro;
        funcionarios[2] = arquiteto;

        for (int i = 0; i<funcionarios.length; i++) {
            if (funcionarios[i] != null) {
                if (funcionarios[i] instanceof Professor) {
                    Professor prof = (Professor) funcionarios[i];
                    prof.mostraInfo();
                    ((Professor)funcionarios[i]).corrigirProvas();
                    prof.corrigirProvas();
                    prof.fazAlgo();
                } else if (funcionarios[i] instanceof Engenheiro) {
                    Engenheiro eng = (Engenheiro) funcionarios[i];
                    eng.mostraInfo();
                    eng.fazAlgo();
                }
                if (funcionarios[i] instanceof Arquiteto) {
                    Arquiteto arq = (Arquiteto) funcionarios[i];
                    arq.mostraInfo();

                }

            }

        }
    }
}
