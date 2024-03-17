package com.mycompany.computregistsaude;

import java.util.Calendar;

/**
 * A classe HealthProfile representa o perfil de saúde de uma pessoa.
 */
public class HealthProfile {
    // Variáveis de instância para armazenar informações sobre a pessoa
    private String nome;
    private String sobrenome;
    private String sexo;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private double altura; // em metros (m)
    private double peso; // em quilogramas (kg)

    /**
     * Construtor da classe HealthProfile.
     * 
     * @param nome           O nome da pessoa.
     * @param sobrenome      O sobrenome da pessoa.
     * @param sexo           O sexo da pessoa.
     * @param diaNascimento  O dia de nascimento da pessoa.
     * @param mesNascimento  O mês de nascimento da pessoa.
     * @param anoNascimento  O ano de nascimento da pessoa.
     * @param altura         A altura da pessoa em metros.
     * @param peso           O peso da pessoa em quilogramas.
     */
    public HealthProfile(String nome, String sobrenome, String sexo, int diaNascimento, int mesNascimento,
            int anoNascimento, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
        this.peso = peso;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    // Métodos getters e setters para todas as variáveis de instância
    public void setPeso(double peso) {
        this.peso = peso;
    }

    // ...
    // Método para calcular a idade da pessoa
    public int calcIdade() {
        Calendar hoje = Calendar.getInstance();
        int anoAtual = hoje.get(Calendar.YEAR);
        int mesAtual = hoje.get(Calendar.MONTH) + 1;
        int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);

        int idade = anoAtual - anoNascimento;

        // Ajuste da idade caso o aniversário ainda não tenha ocorrido neste ano
        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
            idade--;
        }

        return idade;
    }

    // Método para calcular a frequência cardíaca máxima da pessoa
    public int calcularFrequenciaCardiacaMaxima() {
        return 220 - calcIdade();
    }

    // Método para calcular a frequência cardíaca alvo da pessoa
    public String calcularFrequenciaCardiacaAlvo() {
        int frequenciaMaxima = calcularFrequenciaCardiacaMaxima();
        int frequenciaAlvoMinima = (int) (frequenciaMaxima * 0.5);
        int frequenciaAlvoMaxima = (int) (frequenciaMaxima * 0.85);

        return frequenciaAlvoMinima + " - " + frequenciaAlvoMaxima;
    }

    // Método para calcular o Índice de Massa Corporal (IMC) da pessoa
    public double calcIMC() {
        return peso / (altura * altura);
    }

    // Método para determinar o estado do IMC da pessoa
    public String estadoIMC() {
        double imc = calcIMC();

        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidade Grau I";
        } else if (imc >= 35 && imc < 40) {
            return "Obesidade Grau II (severa)";
        } else {
            return "Obesidade Grau III (mórbida)";
        }
    }

    // Método para exibir um gráfico de classificação do IMC
    public void graficoIMC() {
        System.out.println("Menor que 18.5 (Abaixo do peso)\n" +
                            "Entre 18.6 e imc 25 (Peso normal)\n" +
                            "Entre 26 e 30 (Sobrepeso)\n" +
                            "Entre 31 e 35 (Obesidade de grau I)\n" +
                            "Entre 36 e 40 (Obesidade de grau II (severa))\n" +
                            "Maior que 40 (Obesidade de grau III (mórbida))");
    }
}

