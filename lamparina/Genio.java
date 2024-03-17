
package lamparina;


/**
 * Classe abstrata que representa um gênio.
 * Um gênio é uma entidade que pode conceder desejos.
 */
public class Genio {
    /** O número de desejos já concedidos pelo gênio. */
    int desejosConcedidos;

    /**
     * Método abstrato para realizar um desejo.
     * @param desejos O número de desejos a serem concedidos.
     * @return true se o desejo foi concedido com sucesso, false caso contrário.
     */
    public boolean realizarDesejo(int desejos){
        return false;
    }

    /**
     * Retorna o número total de desejos concedidos pelo gênio.
     * @return O número de desejos concedidos.
     */
    public int getDesejosConcedidos() {
        return desejosConcedidos;
    }
}
