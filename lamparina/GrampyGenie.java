package lamparina;


/**
 * Classe que representa um gênio mal-humorado.
 * Um gênio mal-humorado concede apenas o primeiro desejo que lhe é colocado.
 */
public class GrampyGenie extends Genio {
    private boolean desejoConcedido;

    /**
     * Realiza um desejo se ainda não tiver sido concedido.
     * @param desejos O número de desejos a serem concedidos (ignorado nesta implementação).
     * @return true se o desejo foi concedido com sucesso, false se o desejo já tiver sido concedido anteriormente.
     */
    @Override
    public boolean realizarDesejo(int desejos) {
        if (!desejoConcedido) {
            desejosConcedidos++;
            desejoConcedido = true;
            System.out.println("Realizou o desejo!!");
            return true;
        }
        System.out.println("Não realizou o desejo");
        return false;
    }

    /**
     * Retorna uma representação em formato de string do gênio mal-humorado.
     * @return Uma string descrevendo o estado atual do gênio mal-humorado.
     */
    @Override
    public String toString() {
        if (desejoConcedido) {
            return "Genio mal-humorado concedeu um desejo.";
        } else {
            return "Genio mal-humorado tem um desejo para conceder.";
        }
    }
}
