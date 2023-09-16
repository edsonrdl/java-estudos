import java.util.Scanner;

public class LendoDadosPrimitivosNextDouble {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        double n1=0,n2=0,res=0;

        
        System.out.println("Digite um número decimal: ");
        n1=scan.nextDouble();
    
        System.out.println("Digite outro número decimal");
        n2=scan.nextDouble();

        // somar os valores decimais na variável res
         res=n1+n2;

        // Imprima o resultado de res
        System.out.printf("A soma de %f e de %f é igual a %f", n1,n2,res);
        scan.close();
    }
}