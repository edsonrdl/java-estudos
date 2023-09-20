public class doWhileEx01 {
    public static void main(String[] args) {
        int cont =0;
        do {
            System.out.println(cont +" "+ "valor atual de cont");
            cont++;
        } while (cont<=9);
        System.out.print("Fim da execução");
    }
   
}
//No loop do..while começa executando e testa depois ,nesse sentido se a condção já for satisfeita ele vai executar ao menos uma vez 