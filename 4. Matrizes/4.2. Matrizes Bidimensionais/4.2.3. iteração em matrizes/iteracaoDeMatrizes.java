import java.security.SecureRandom;

public class iteracaoDeMatrizes {
    public static void main(String[] args) {

        final int linhas=3;
        final int colunas=4;
        int[][] arrayExemplo=new int[linhas][colunas];

        for(int l=0;l<linhas;l++){
            for(int c=0 ;c<colunas;c++){
                arrayExemplo[l][c]=new SecureRandom().nextInt(100);
            }
        }
        for(int[] n:arrayExemplo){
            for(int i:n){
                System.out.printf("%d \n", i);
            }
      
        }
    }
 }
