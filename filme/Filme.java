
package filme;

/**
 * Esta classe representa um filme com um título e duração em minutos.
 */
public class Filme {
    private String titulo;
    private int duracaoEmMinutos;

    /**
     * Construtor para criar um objeto Filme com o título e a duração em minutos fornecidos.
     * @param titulo O título do filme.
     * @param duracaoEmMinutos A duração do filme em minutos.
     */
    public Filme(String titulo, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    /**
     * Obtém o título do filme.
     * @return O título do filme.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o título do filme.
     * @param titulo O título do filme.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtém a duração do filme em minutos.
     * @return A duração do filme em minutos.
     */
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    /**
     * Define a duração do filme em minutos.
     * @param duracaoEmMinutos A duração do filme em minutos.
     */
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    
    /**
     * Exibe a duração do filme em horas e minutos.
     */
    public void exibirDuracaoEmHoras() {
        int horas = duracaoEmMinutos / 60;
        int minutos = duracaoEmMinutos % 60;
        System.out.println("O filme " + titulo + " possui " + horas + " horas e " + minutos + " minutos de duração.");
    }
}

