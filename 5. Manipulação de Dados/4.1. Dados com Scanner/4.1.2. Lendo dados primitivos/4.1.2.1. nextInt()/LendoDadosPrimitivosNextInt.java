import java.util.Scanner;

public class LendoDadosPrimitivos {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
    
        int n1=0,n2=0,res=0;
    
        System.out.println("Digite um numero");
        n1=scan.nextInt();
        System.out.println("Digite outro numero");
        n2=scan.nextInt();
        res=n1+n2;
        System.out.printf("Soma de %d de %d e igual %d",n1,n2,res);
        scan.close();
}
}
