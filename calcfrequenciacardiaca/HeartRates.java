
package calcfrequenciacardiaca;

import java.util.Calendar;

/**
 * A classe HeartRates representa informações sobre a frequência cardíaca de uma pessoa.
 */
public class HeartRates {
    // Declaração de variáveis de instância
    private String nome;
    private String sobrenome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;

    /**
     * Construtor da classe HeartRates.
     * 
     * @param nome          O nome da pessoa.
     * @param sobrenome     O sobrenome da pessoa.
     * @param diaNascimento O dia de nascimento da pessoa.
     * @param mesNascimento O mês de nascimento da pessoa.
     * @param anoNascimento O ano de nascimento da pessoa.
     */
    public HeartRates(String nome, String sobrenome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }

    // Métodos getters e setters para cada variável de instância

    /**
     * Obtém o nome da pessoa.
     * 
     * @return O nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa.
     * 
     * @param nome O nome da pessoa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o sobrenome da pessoa.
     * 
     * @return O sobrenome da pessoa.
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * Define o sobrenome da pessoa.
     * 
     * @param sobrenome O sobrenome da pessoa.
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * Obtém o dia de nascimento da pessoa.
     * 
     * @return O dia de nascimento da pessoa.
     */
    public int getDiaNascimento() {
        return diaNascimento;
    }

    /**
     * Define o dia de nascimento da pessoa.
     * 
     * @param diaNascimento O dia de nascimento da pessoa.
     */
    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    /**
     * Obtém o mês de nascimento da pessoa.
     * 
     * @return O mês de nascimento da pessoa.
     */
    public int getMesNascimento() {
        return mesNascimento;
    }

    /**
     * Define o mês de nascimento da pessoa.
     * 
     * @param mesNascimento O mês de nascimento da pessoa.
     */
    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    /**
     * Obtém o ano de nascimento da pessoa.
     * 
     * @return O ano de nascimento da pessoa.
     */
    public int getAnoNascimento() {
        return anoNascimento;
    }

    /**
     * Define o ano de nascimento da pessoa.
     * 
     * @param anoNascimento O ano de nascimento da pessoa.
     */
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    /**
     * Calcula a idade da pessoa com base na data atual.
     * 
     * @return A idade da pessoa em anos.
     */
    public int calcularIdade() {
        Calendar hoje = Calendar.getInstance();
        int anoAtual = hoje.get(Calendar.YEAR);
        int mesAtual = hoje.get(Calendar.MONTH) + 1;
        int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);

        int idade = anoAtual - anoNascimento;

        // Ajuste da idade caso o aniversário ainda não tenha ocorrido neste ano
        if (mesNascimento > mesAtual || (mesNascimento == mesAtual && diaNascimento > diaAtual)) {
            idade--;
        }

        return idade;
    }

    /**
     * Calcula a frequência cardíaca máxima da pessoa.
     * 
     * @return A frequência cardíaca máxima da pessoa em batimentos por minuto (bpm).
     */
    public int calcularFrequenciaCardiacaMaxima() {
        return 220 - calcularIdade();
    }

    /**
     * Calcula o intervalo de frequência cardíaca alvo da pessoa.
     * 
     * @return O intervalo de frequência cardíaca alvo da pessoa, no formato "min - max" (bpm).
     */
    public String calcularFrequenciaCardiacaAlvo() {
        int frequenciaMaxima = calcularFrequenciaCardiacaMaxima();
        int frequenciaAlvoMinima = (int) (frequenciaMaxima * 0.5);
        int frequenciaAlvoMaxima = (int) (frequenciaMaxima * 0.85);

        return frequenciaAlvoMinima + " - " + frequenciaAlvoMaxima;
    }
}
