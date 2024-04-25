import java.util.HashMap;
import java.util.Map;

// Interface para definir as ações
interface Acao {
    void executar();
}

// Implementações das ações
class AcaoA implements Acao {
    public void executar() {
        System.out.println("Executando a Ação A");
    }
}

class AcaoB implements Acao {
    public void executar() {
        System.out.println("Executando a Ação B");
    }
}

public class DispatcherMap {
    private Map<String, Acao> mapaAcoes = new HashMap<>();

    // Método para adicionar ações ao mapa de dispatadores
    public void adicionarAcao(String chave, Acao acao) {
        mapaAcoes.put(chave, acao);
    }

    // Método para executar uma ação com base na chave
    public void executarAcao(String chave) {
        Acao acao = mapaAcoes.get(chave);
        if (acao != null) {
            acao.executar();
        } else {
            System.out.println("Ação não encontrada para a chave: " + chave);
        }
    }

    public static void main(String[] args) {
        DispatcherMap dispatcher = new DispatcherMap();

        // Adicionar ações ao mapa de dispatadores
        dispatcher.adicionarAcao("acaoA", new AcaoA());
        dispatcher.adicionarAcao("acaoB", new AcaoB());

        // Executar ações com base nas chaves
        dispatcher.executarAcao("acaoA");
        dispatcher.executarAcao("acaoB");
        dispatcher.executarAcao("acaoC"); // Isso não vai encontrar uma ação correspondente
    }
}
