public class adicionandoElementosAUmArray {
   public static void main(String[] args) {
    int [] arrayExemplo= new int[3];
    System.out.println("O valor do indice do array é :"+arrayExemplo[0]);
    //Vamos adiconar um valor ao mesmo indice ,quando não é declarado o java adiciona 0 
    arrayExemplo[0]=30;
    System.out.println("Novo valor do indice é :"+arrayExemplo[0]);
   } 
}
