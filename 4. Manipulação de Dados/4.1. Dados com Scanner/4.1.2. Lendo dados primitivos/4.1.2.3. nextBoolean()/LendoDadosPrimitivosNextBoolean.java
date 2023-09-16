import java.util.Scanner;

public class LendoDadosPrimitivosNextBoolean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite true ou false: ");
        
        // Use o método nextBoolean para ler um valor booleano
        boolean valorBooleano = scan.nextBoolean();
        
        // Imprima o valor lido
        System.out.println("Você digitou: " + valorBooleano);
        
        // Não se esqueça de fechar o Scanner quando não precisar mais dele
        scan.close();
    }
}
