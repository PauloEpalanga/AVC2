package lamparina;

/**
 * Classe que representa um gênio bem-humorado.
 * Um gênio bem-humorado concede todos os desejos que lhe são colocados até atingir o limite com o qual foi invocado.
 */
public class FriendlyGenie extends Genio {
    private int desejosRestantes;

    /**
     * Realiza um desejo se ainda houver desejos restantes.
     * @param desejos O número de desejos a serem concedidos.
     * @return true se o desejo foi concedido com sucesso, false se não houver desejos restantes.
     */
    @Override
    public boolean realizarDesejo(int desejos) {
        if (desejosRestantes > 0) {
            desejosConcedidos += desejos;
            desejosRestantes -= desejos;
            System.out.println("Realizou o desejo!!");
            return true;
        }
        System.out.println("Não realizou o desejo");
        return false;
    }

    /**
     * Retorna a quantidade de desejos restantes que o gênio pode conceder.
     * @return O número de desejos restantes.
     */
    public int getDesejosRestantes() {
        return desejosRestantes;
    }

    /**
     * Verifica se o gênio ainda pode conceder desejos.
     * @return true se ainda houver desejos restantes, false caso contrário.
     */
    public boolean podeRealizarDesejo() {
        return desejosRestantes > 0;
    }

    /**
     * Retorna uma representação em formato de string do gênio bem-humorado.
     * @return Uma string descrevendo o estado atual do gênio bem-humorado.
     */
    @Override
    public String toString() {
        return "Genio bem-humorado realizou " + getDesejosConcedidos() + " desejos e ainda tem " + desejosRestantes + " para conceder.";
    }
}
