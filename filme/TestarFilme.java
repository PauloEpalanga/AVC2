package filme;


/**
 * Esta classe é usada para testar a classe Filme.
 */
public class TestarFilme {

    /**
     * O método main é o ponto de entrada para o programa.
     * @param args Os argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        // Criação de instâncias de Filme com diferentes títulos e durações
        Filme _filme1 = new Filme("Os Vingadores", 142);
        Filme _filme2 = new Filme("Hotel Transilvania", 93);
        Filme _filme3 = new Filme("Mama Mia", 120);
        Filme _filme4 = new Filme("50 Sombras de Grey", 78);
        Filme _filme5 = new Filme("Love", 97);
        
        // Exibição da duração dos filmes em horas
        _filme1.exibirDuracaoEmHoras();   
        _filme2.exibirDuracaoEmHoras();
        _filme3.exibirDuracaoEmHoras();   
        _filme4.exibirDuracaoEmHoras();
        _filme5.exibirDuracaoEmHoras();
        
        // Impressão dos filmes em cartaz
        System.out.println("Os filmes em cartaz são:\n"
                            + "1. " + _filme1.getTitulo() + "\n"
                            + "2. " + _filme2.getTitulo());
    }
}

