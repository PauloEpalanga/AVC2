package lamparina;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa uma lâmpada mágica que pode liberar gênios.
 * Uma lâmpada mágica possui uma quantidade inicial de gênios que podem ser liberados ao serem esfregados.
 * Quando todos os gênios são esgotados, a lâmpada cria pequenos demônios em vez de gênios.
 * A lâmpada pode ser recarregada alimentando um demônio.
 */
public class MagicLamp {
    /** A quantidade inicial de gênios que a lâmpada possui. */
    private int geniosIniciais;
    
    /** A quantidade atual de gênios restantes na lâmpada. */
    private int geniosRestantes;
    
    /** O número de demônios reciclados pela lâmpada. */
    private int demoniosReciclados;
    
    /** Lista de gênios disponíveis na lâmpada. */
    private List<Genio> genios;

    /**
     * Constrói uma nova lâmpada mágica com a quantidade inicial de gênios especificada.
     * @param geniosIniciais A quantidade inicial de gênios.
     */
    public MagicLamp(int geniosIniciais) {
        this.geniosIniciais = geniosIniciais;
        this.geniosRestantes = geniosIniciais;
        this.demoniosReciclados = 0;
        this.genios = new ArrayList<>();
        for (int i = 0; i < geniosIniciais; i++) {
            this.genios.add(new Genio());
        }
    }

    /**
     * Obtém a quantidade de gênios restantes na lâmpada.
     * @return A quantidade de gênios restantes.
     */
    public int getGeniosRestantes() {
        return geniosRestantes;
    }

    /**
     * Obtém o número de demônios reciclados pela lâmpada.
     * @return O número de demônios reciclados.
     */
    public int getDemoniosReciclados() {
        return demoniosReciclados;
    }

    /**
     * Esfrega a lâmpada para liberar um gênio e especifica a quantidade de desejos esperados.
     * @param desejos A quantidade de desejos a serem concedidos pelo gênio.
     */
    public void esfregar(int desejos) {
        if (geniosRestantes > 0) {
            geniosRestantes--;
            genios.get(geniosIniciais - geniosRestantes - 1).realizarDesejo(desejos);
        } else {
            demoniosReciclados++;
            System.out.println("A lâmpada cria um pequeno demônio que responde a pedidos de forma literal mas perversa.");
        }
    }

    /**
     * Obtém a lista de gênios disponíveis na lâmpada.
     * @return A lista de gênios.
     */
    public List<Genio> getGenios() {
        return this.genios;
    }

    /**
     * Alimenta um demônio para recarregar a lâmpada, se houver demônios reciclados.
     */
    public void alimentarDemonio() {
        if (demoniosReciclados > 0) {
            demoniosReciclados--;
            geniosRestantes += geniosIniciais;
            System.out.println("A lâmpada foi recarregada.");
        }
    }

    /**
     * Verifica se a lâmpada é igual a outro objeto.
     * @param obj O objeto a ser comparado.
     * @return true se os objetos forem iguais, false caso contrário.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MagicLamp _lampada = (MagicLamp) obj;
        return geniosIniciais == _lampada.geniosIniciais &&
                geniosRestantes == _lampada.geniosRestantes &&
                demoniosReciclados == _lampada.demoniosReciclados;
    }
}
