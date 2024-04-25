import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        // Crie um mapa para mapear os casos para as ações
        Map<String, Consumer<Void>> actions = new HashMap<>();
        
        // Adicione as ações para cada caso
        actions.put("case1", () -> {
            // Ação para o caso 1
            System.out.println("Executando ação para o caso 1");
        });
        
        actions.put("case2", () -> {
            // Ação para o caso 2
            System.out.println("Executando ação para o caso 2");
        });
        
        // Exemplo de uso:
        String input = "case1"; // Aqui você teria sua entrada dinâmica
        Consumer<Void> action = actions.get(input);
        if (action != null) {
            action.accept(null);
        } else {
            System.out.println("Nenhuma ação encontrada para o caso: " + input);
        }
    }
}
