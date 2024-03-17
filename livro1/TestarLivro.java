package livro1;

/**
 * A classe TestarLivro é responsável por demonstrar o uso da classe Livro
 * criando várias instâncias e configurando-as com diferentes valores de páginas lidas.
 */
public class TestarLivro {

    /**
     * O método principal que é executado quando o programa é iniciado.
     * @param args Os argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        // Criação e configuração do primeiro livro favorito (_livroFavorito)
        Livro _livroFavorito = new Livro("", 0, 0);
        _livroFavorito.setTitulo("O Pequeno Príncipe");
        _livroFavorito.setQtdPaginas(98);
        System.out.println("O livro " + _livroFavorito.getTitulo() + " tem " + _livroFavorito.getQtdPaginas()
                            + " páginas");
        _livroFavorito.setPaginasLidas(20);
        _livroFavorito.verificarProgresso();
        _livroFavorito.setPaginasLidas(50);
        _livroFavorito.verificarProgresso();

        // Criação e configuração do segundo livro favorito (_favorito1)
        Livro _favorito1 = new Livro("Dom Casmurro", 200, 0);
        _favorito1.setPaginasLidas(50);
        System.out.println("O livro " + _favorito1.getTitulo() + " tem " + _favorito1.getQtdPaginas()
                            + " páginas");
        _favorito1.verificarProgresso();

        // Criação e configuração do terceiro livro favorito (_favorito2)
        Livro _favorito2 = new Livro("A Metamorfose", 130, 0);
        _favorito2.setPaginasLidas(20);
        System.out.println("O livro " + _favorito2.getTitulo() + " tem " + _favorito2.getQtdPaginas()
                            + " páginas");
        _favorito2.verificarProgresso();

        // Criação e configuração do quarto livro favorito (_favorito3)
        Livro _favorito3 = new Livro("Memórias Póstumas de Brás Cubas", 250, 0);
        _favorito3.setPaginasLidas(100);
        System.out.println("O livro " + _favorito3.getTitulo() + " tem " + _favorito3.getQtdPaginas()
                            + " páginas");
        _favorito3.verificarProgresso();

        // Criação e configuração do quinto livro favorito (_favorito4)
        Livro _favorito4 = new Livro("Grande Sertão: Veredas", 500, 0);
        _favorito4.setPaginasLidas(200);
        System.out.println("O livro " + _favorito4.getTitulo() + " tem " + _favorito4.getQtdPaginas()
                            + " páginas");
        _favorito4.verificarProgresso();

        // Criação e configuração do sexto livro favorito (_favorito5)
        Livro _favorito5 = new Livro("Crime e Castigo", 400, 0);
        _favorito5.setPaginasLidas(150);
        System.out.println("O livro " + _favorito5.getTitulo() + " tem " + _favorito5.getQtdPaginas()
                            + " páginas");
        _favorito5.verificarProgresso();

        // Criação e configuração do sétimo livro favorito (_favorito6)
        Livro _favorito6 = new Livro("Cem Anos de Solidão", 350, 0);
        _favorito6.setPaginasLidas(100);
        System.out.println("O livro " + _favorito6.getTitulo() + " tem " + _favorito6.getQtdPaginas()
                            + " páginas");
        _favorito6.verificarProgresso();

        // Criação e configuração do oitavo livro favorito (_favorito7)
        Livro _favorito7 = new Livro("1984", 300, 0);
        _favorito7.setPaginasLidas(100);
        System.out.println("O livro " + _favorito7.getTitulo() + " tem " + _favorito7.getQtdPaginas()
                            + " páginas");
        _favorito7.verificarProgresso();

        // Criação e configuração do nono livro favorito (_favorito8)
        Livro _favorito8 = new Livro("O Hobbit", 250, 0);
        _favorito8.setPaginasLidas(80);
        System.out.println("O livro " + _favorito8.getTitulo() + " tem " + _favorito8.getQtdPaginas()
                            + " páginas");
        _favorito8.verificarProgresso();

        // Criação e configuração do décimo livro favorito (_favorito9)
        Livro _favorito9 = new Livro("O Nome do Vento", 600, 0);
        _favorito9.setPaginasLidas(200);
        System.out.println("O livro " + _favorito9.getTitulo() + " tem " + _favorito9.getQtdPaginas()
                            + " páginas");
        _favorito9.verificarProgresso();

        // Criação e configuração do décimo primeiro livro favorito (_favorito10)
        Livro _favorito10 = new Livro("As Crônicas de Nárnia", 300, 0);
        _favorito10.setPaginasLidas(120);
        System.out.println("O livro " + _favorito10.getTitulo() + " tem " + _favorito10.getQtdPaginas()
                            + " páginas");
        _favorito10.verificarProgresso();
    }    
}

