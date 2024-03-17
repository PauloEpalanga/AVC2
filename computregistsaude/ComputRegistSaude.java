package com.mycompany.computregistsaude;

import java.util.Scanner;

/**
 * Classe principal que permite ao usuário inserir informações sobre uma pessoa
 * e exibe várias informações de saúde com base nesses dados.
 */
public class ComputRegistSaude {
    /**
     * Método principal que é executado quando o programa é iniciado.
     * 
     * @param args Os argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        Scanner _entrada = new Scanner(System.in);

        // Declaração das variáveis para armazenar informações sobre a pessoa
        String nome;
        String sobrenome;
        String sexo;
        int diaNascimento;
        int mesNascimento;
        int anoNascimento;
        double altura;
        double peso;

        // Declaração do objeto HealthProfile
        HealthProfile _pessoa;

        // Solicita ao usuário que insira o nome
        System.out.println("Informe o nome: ");
        nome = _entrada.next();

        // Solicita ao usuário que insira o sobrenome
        System.out.println("Informe o sobrenome: ");
        sobrenome = _entrada.next();

        // Solicita ao usuário que insira o sexo
        System.out.println("Informe o sexo: ");
        sexo = _entrada.next();

        // Solicita ao usuário que insira o dia de nascimento
        System.out.print("Informe o dia de nascimento: ");
        diaNascimento = _entrada.nextInt();

        // Solicita ao usuário que insira o mês de nascimento
        System.out.print("Informe o mês de nascimento: ");
        mesNascimento = _entrada.nextInt();

        // Solicita ao usuário que insira o ano de nascimento
        System.out.print("Informe o ano de nascimento: ");
        anoNascimento = _entrada.nextInt();

        // Solicita ao usuário que insira a altura
        System.out.println("Informe a altura (m): ");
        altura = _entrada.nextDouble();

        // Solicita ao usuário que insira o peso
        System.out.println("Informe o peso (kg): ");
        peso = _entrada.nextDouble();

        // Cria um objeto HealthProfile com base nas informações fornecidas pelo usuário
        _pessoa = new HealthProfile(nome, sobrenome, sexo, diaNascimento, mesNascimento, anoNascimento, altura, peso);

        // Imprime as informações da pessoa, incluindo nome, sexo, data de nascimento, idade, altura, peso,
        // frequência cardíaca máxima, frequência cardíaca alvo, IMC e estado do IMC
        System.out.println("\nInformações da pessoa:");
        System.out.println("Nome: " + _pessoa.getNome() + " " + _pessoa.getSobrenome());
        System.out.println("Sexo: " + _pessoa.getSexo());
        System.out.println("Data de Nascimento: " + _pessoa.getDiaNascimento() + "/" + _pessoa.getMesNascimento() + "/" + _pessoa.getAnoNascimento());
        System.out.println("Idade: " + _pessoa.calcIdade() + " anos");
        System.out.println("Altura: " + _pessoa.getAltura() + "m");
        System.out.println("Peso: " + _pessoa.getPeso() + "kg");
        System.out.println("Frequência Cardíaca Máxima: " + _pessoa.calcularFrequenciaCardiacaMaxima() + " bpm");
        System.out.println("Frequência Cardíaca Alvo: " + _pessoa.calcularFrequenciaCardiacaAlvo() + " bpm");
        System.out.println("IMC: " + _pessoa.calcIMC());
        System.out.println("Estado IMC: " + _pessoa.estadoIMC());

        // Gera um gráfico do IMC
        _pessoa.graficoIMC();

        // Fecha o scanner para liberar recursos
        _entrada.close();
    }
}

