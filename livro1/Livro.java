package livro1;

/**
 * A classe Livro representa um livro com título, quantidade de páginas e progresso de leitura.
 */
public class Livro {
    private String titulo;      // Título do livro
    private int qtdPaginas;     // Quantidade total de páginas do livro
    private int paginasLidas;   // Quantidade de páginas já lidas pelo leitor

    /**
     * Construtor da classe Livro.
     * @param titulo O título do livro.
     * @param qtdPaginas A quantidade total de páginas do livro.
     * @param paginasLidas A quantidade de páginas já lidas pelo leitor.
     */
    public Livro(String titulo, int qtdPaginas, int paginasLidas) {
        this.titulo = titulo;
        this.qtdPaginas = qtdPaginas;
        this.paginasLidas = paginasLidas;
    }

    /**
     * Retorna o título do livro.
     * @return O título do livro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o título do livro.
     * @param titulo O título do livro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Retorna a quantidade total de páginas do livro.
     * @return A quantidade total de páginas do livro.
     */
    public int getQtdPaginas() {
        return qtdPaginas;
    }

    /**
     * Define a quantidade total de páginas do livro.
     * @param qtdPaginas A quantidade total de páginas do livro.
     */
    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    /**
     * Retorna a quantidade de páginas já lidas pelo leitor.
     * @return A quantidade de páginas já lidas pelo leitor.
     */
    public int getPaginasLidas() {
        return paginasLidas;
    }

    /**
     * Define a quantidade de páginas já lidas pelo leitor.
     * @param paginasLidas A quantidade de páginas já lidas pelo leitor.
     */
    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }
        
    /**
     * Verifica o progresso de leitura do livro e imprime a porcentagem de páginas lidas.
     */
    public void verificarProgresso(){
        double porcentagem = (paginasLidas * 100.0) / qtdPaginas; // Calcula a porcentagem de páginas lidas
        String numeroFormatado = String.format("%.1f", porcentagem);

        System.out.println("Você já leu " + numeroFormatado + "% do livro."); // Imprime a porcentagem de páginas lidas
    }
}

