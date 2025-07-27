import java.util.ArrayList;
import java.util.List;

public class ListExemplo {
    public static void main(String[] args) {
      List<String> ListaDeTec = new ArrayList<>();
      ListaDeTec.add("JavaScript");

      ListaDeTec.stream()
                .filter(tecnologia -> tecnologia.startsWith("JavaScript"))
                .forEach(System.out::println);
      
    }


}
