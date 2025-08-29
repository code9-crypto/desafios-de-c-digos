package sistemaNotas;

import java.util.*;

public class SistemaNotasAlunos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Armazena os alunos e suas notas (cada aluno tem uma lista de 3 notas)
        Map<String, List<Double>> alunos = new HashMap<>();

        System.out.print("Digite a quantidade de alunos: ");
        int qtdAlunos = sc.nextInt();
        sc.nextLine(); // consumir quebra de linha

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.print("\nNome do aluno: ");
            String nome = sc.nextLine();

            List<Double> notas = new ArrayList<>();
            for (int j = 1; j <= 3; j++) {
                System.out.print("Digite a nota " + j + ": ");
                notas.add(sc.nextDouble());
            }
            sc.nextLine(); // consumir quebra de linha
            alunos.put(nome, notas);
        }

        // Variáveis para cálculos
        String melhorAluno = "";
        double maiorMedia = 0;
        double somaMedias = 0;

        // Guardar médias de cada aluno
        Map<String, Double> mediasAlunos = new HashMap<>();

        // Cálculo da média de cada aluno
        for (Map.Entry<String, List<Double>> entry : alunos.entrySet()) {
            String nome = entry.getKey();
            List<Double> notas = entry.getValue();

            double soma = 0;
            for (double nota : notas) {
                soma += nota;
            }
            double media = soma / notas.size();
            mediasAlunos.put(nome, media);

            // Verifica o melhor aluno
            if (media > maiorMedia) {
                maiorMedia = media;
                melhorAluno = nome;
            }

            somaMedias += media;
        }

        // Média geral da turma
        double mediaGeral = somaMedias / qtdAlunos;

        // Conta alunos acima da média geral
        int acimaMedia = 0;
        for (double media : mediasAlunos.values()) {
            if (media > mediaGeral) {
                acimaMedia++;
            }
        }

        // Saída de resultados
        System.out.println("\n===== RESULTADOS =====");
        for (Map.Entry<String, Double> entry : mediasAlunos.entrySet()) {
            System.out.printf("Média de %s: %.2f%n", entry.getKey(), entry.getValue());
        }
        System.out.printf("\nAluno com maior média: %s (%.2f)%n", melhorAluno, maiorMedia);
        System.out.printf("Média geral da turma: %.2f%n", mediaGeral);
        System.out.println("Alunos acima da média geral: " + acimaMedia);

        sc.close();
    }
}
