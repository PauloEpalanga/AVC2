package lamparina;

/**
 * Classe que representa um demônio reciclável.
 * Um demônio reciclável concede desejos enquanto não estiver reciclado.
 * Depois de reciclado, ele não pode conceder mais desejos.
 */
public class RecyclableDemon extends Genio {
    private boolean reciclado;

    /**
     * Realiza um desejo se o demônio não estiver reciclado.
     * @param desejos O número de desejos a serem concedidos.
     * @return true se o desejo foi concedido com sucesso, false se o demônio estiver reciclado.
     */
    @Override
    public boolean realizarDesejo(int desejos) {
        if (!reciclado) {
            desejosConcedidos += desejos;
            return true;
        }
        return false;
    }

    /**
     * Recicla o demônio, impedindo-o de conceder mais desejos.
     * @return true se o demônio foi reciclado com sucesso, false se já estiver reciclado.
     */
    public boolean reciclar() {
        if (!reciclado) {
            reciclado = true;
            return true;
        }
        return false;
    }

    /**
     * Verifica se o demônio está reciclado.
     * @return true se o demônio estiver reciclado, false caso contrário.
     */
    public boolean getReciclado() {
        return reciclado;
    }

    /**
     * Retorna uma representação em formato de string do demônio.
     * @return Uma string descrevendo o estado atual do demônio.
     */
    @Override
    public String toString() {
        if (!reciclado) {
            return "Demonio reciclavel concedeu " + getDesejosConcedidos() + " desejos.";
        } else {
            return "Demonio foi reciclado.";
        }
    }
}
