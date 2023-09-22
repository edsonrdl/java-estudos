public class manipulacaoDeVetores {
    public static void main(String[] args) {
        int[] vetor = {5, 10, 15, 20, 25};

        // Acessando elementos do vetor
        System.out.println("Elemento na posição 2: " + vetor[2]); // Saída: 15

        // Calculando a soma de todos os elementos do vetor
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.println("Soma de todos os elementos: " + soma); // Saída: 75

        // Encontrando o valor máximo no vetor
        int maximo = 0;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maximo) {
                maximo = vetor[i];
            }
        }
        System.out.println("Valor máximo: " + maximo); // Saída: 25
    }
}
