package lamparina;

/**
 * Representa a classe principal do programa Arabian Nights.
 * Esta classe contém o método estático main, que executa a sequência de operações
 * conforme especificado no enunciado do exercício.
 */
public class ArabianNights {

    /**
     * O método principal do programa Arabian Nights.
     * Executa a sequência de operações conforme especificado no enunciado do exercício.
     * @param args Os argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        // Cria uma lâmpada mágica com capacidade para 4 gênios
        MagicLamp _lampada = new MagicLamp(4);
        
        // Esfrega a lâmpada várias vezes, especificando o número de desejos
        _lampada.esfregar(2);
        _lampada.esfregar(3);
        _lampada.esfregar(4);
        _lampada.esfregar(5);
        _lampada.esfregar(1);

        // Imprime o resultado do método toString para cada gênio na lâmpada
        for (Genio genio : _lampada.getGenios()) {
            System.out.println(genio.toString());
        }

        // Realiza um desejo para cada gênio na lâmpada e imprime o resultado
        _lampada.getGenios().forEach((genio) -> {
            if (genio instanceof FriendlyGenie) {
                genio.realizarDesejo(1);
            } else if (genio instanceof GrampyGenie) {
                System.out.println(((GrampyGenie) genio).realizarDesejo(1));
            }
        });

        // Imprime o resultado do método toString para cada gênio na lâmpada após realizar os desejos
        for (Genio genio : _lampada.getGenios()) {
           System.out.println("Genio bem-humorado realizou " + genio.getDesejosConcedidos() + " desejos e ainda tem " + _lampada.getGeniosRestantes() + " para conceder.");
        }

        // Cria um demônio reciclável, alimenta a lâmpada com ele e esfrega a lâmpada novamente
        RecyclableDemon demonio = new RecyclableDemon();
        _lampada.alimentarDemonio();
        _lampada.esfregar(7);
        
        // Imprime o resultado do método toString para o demônio reciclável
        System.out.println(demonio.toString());
    }
}
