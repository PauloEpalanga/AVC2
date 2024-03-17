package calcfrequenciacardiaca;

import java.util.Scanner;
/**
 * Classe principal
 * Este programa cria instâncias da classe HeartRates e exibe seu funcionamento seu funcionamento.
 */
public class CalcFrequenciaCardiaca {
    /**
     * Método principal que é executado quando o programa é iniciado.
     * @param args Os argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        Scanner _entrada = new Scanner(System.in);

        // Declaração de variáveis para armazenar informações da _pessoa
        String nome;
        String sobrenome;
        int diaNascimento;
        int mesNascimento;
        int anoNascimento;

        // Declaração do objeto HeartRates
        HeartRates _pessoa;

        // Solicita ao usuário que insira o nome
        System.out.print("Informe o nome: ");
        nome = _entrada.nextLine();

        // Solicita ao usuário que insira o sobrenome
        System.out.print("Informe o sobrenome: ");
        sobrenome = _entrada.nextLine();

        // Solicita ao usuário que insira o dia de nascimento
        System.out.print("Informe o dia de nascimento: ");
        diaNascimento = _entrada.nextInt();

        // Solicita ao usuário que insira o mês de nascimento
        System.out.print("Informe o mês de nascimento: ");
        mesNascimento = _entrada.nextInt();

        // Solicita ao usuário que insira o ano de nascimento
        System.out.print("Informe o ano de nascimento: ");
        anoNascimento = _entrada.nextInt();

        // Cria um objeto HeartRates com base nas informações fornecidas pelo usuário
        _pessoa = new HeartRates(nome, sobrenome, diaNascimento, mesNascimento, anoNascimento);

        // Imprime as informações da _pessoa, incluindo nome, data de nascimento, idade, frequência cardíaca máxima e frequência cardíaca alvo
        System.out.println("\nInformações da _pessoa:");
        System.out.println("Nome: " + _pessoa.getNome() + " " + _pessoa.getSobrenome());
        System.out.println("Data de Nascimento: " + _pessoa.getDiaNascimento() + "/" + _pessoa.getMesNascimento() + "/" + _pessoa.getAnoNascimento());
        System.out.println("Idade: " + _pessoa.calcularIdade() + " anos");
        System.out.println("Frequência Cardíaca Máxima: " + _pessoa.calcularFrequenciaCardiacaMaxima() + " bpm");
        System.out.println("Frequência Cardíaca Alvo: " + _pessoa.calcularFrequenciaCardiacaAlvo() + " bpm");

        // Fecha o scanner para liberar recursos
        _entrada.close();
    }
}
