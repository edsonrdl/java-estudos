import java.util.Scanner;

public class LendoString {
  
  public static void main(String[] args) {
      Scanner scan =new Scanner(System.in);
    String nome="";

    System.out.println("Digite Seu Nome");
    nome=scan.nextLine();
   
    System.out.printf("Seu nomeEds %s está correto?",nome);
    scan.close();
  }
}
