public class inicializandoArrays {
    public static void main(String[] args) {

        //Inicialização com números de indices vazios
        int[] arrayExemplo01=new int[5];   //Declaração de arrays do tipo  int com 5 indices,porém é criado vazio 
        System.out.println(arrayExemplo01[0]);

        //Inicialização direta
        int[] arrayExemplo02 = {3, 2, 7, 111, 5}; // Inicializa um array de inteiros com valores.
        System.out.println(arrayExemplo02[0]);

        //Inicialização em linha
        int[] arrayExemplo03 = new int[]{2, 9, 3, 4, 23}; // Outra forma de inicializar um array.
        System.out.println(arrayExemplo03[0]);

        //Inicialização em loop
            int tamanho = 5;
        int[] arrayExemplo04 = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            arrayExemplo04[i] = i + 1; // Inicializa com valores de 1 a 5.
        }
        System.out.println(arrayExemplo04[0]);

    //  //Inicialização com método de função
    // public static int[] getNumeros() {
    //     return new int[]{1, 2, 3, 4, 5};
    // }
    // // Para usar:
    // int[] arrayExemplo05 = getNumeros();
    // System.out.println(arrayExemplo05);
    
    }

}
