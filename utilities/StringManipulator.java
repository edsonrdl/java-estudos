import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulator {

    public static void main(String[] args) {
        String descriminassao = "SERVICOS PRESTADOS 01/01/2024 NUMERO DO PEDIDO: 34434 LOJA: 1380 SERVICOS: MONITORAMENTO DE ALARME.";
        String novoPedido = "12345";
        
        String resultado = atualizarDescriminassao(descriminassao, novoPedido);
        System.out.println(resultado);
    }

    public static String atualizarDescriminassao(String descriminassao, String novoPedido) {
        // Padrões regex para encontrar a data nos formatos dd/MM/yyyy ou MM/yyyy após "SERVICOS PRESTADOS"
        Pattern datePatternFull = Pattern.compile("SERVICOS PRESTADOS (\\d{2}/\\d{2}/\\d{4})");
        Pattern datePatternShort = Pattern.compile("SERVICOS PRESTADOS (\\d{2}/\\d{4})");
        Matcher dateMatcherFull = datePatternFull.matcher(descriminassao);
        Matcher dateMatcherShort = datePatternShort.matcher(descriminassao);

        // Substituir a data no formato dd/MM/yyyy
        if (dateMatcherFull.find()) {
            String dataAtualStr = dateMatcherFull.group(1);
            DateTimeFormatter formatterFull = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            try {
                LocalDate dataAtual = LocalDate.parse(dataAtualStr, formatterFull);

                // Subtrair um mês
                LocalDate dataNova = dataAtual.minusMonths(1);
                String novaDataStr = dataNova.format(DateTimeFormatter.ofPattern("MM/yyyy"));

                descriminassao = descriminassao.replace(dataAtualStr, novaDataStr);
            } catch (DateTimeParseException e) {
                e.printStackTrace();
            }
        }

        // Substituir a data no formato MM/yyyy
        if (dateMatcherShort.find()) {
            String dataAtualStr = dateMatcherShort.group(1);
            DateTimeFormatter formatterShort = DateTimeFormatter.ofPattern("MM/yyyy");
            try {
                LocalDate dataAtual = LocalDate.parse("01/" + dataAtualStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                // Subtrair um mês
                LocalDate dataNova = dataAtual.minusMonths(1);
                String novaDataStr = dataNova.format(formatterShort);

                descriminassao = descriminassao.replace(dataAtualStr, novaDataStr);
            } catch (DateTimeParseException e) {
                e.printStackTrace();
            }
        }

        // Padrão regex para encontrar o número do pedido
        Pattern pedidoPattern = Pattern.compile("NUMERO DO PEDIDO: \\d+");
        Matcher pedidoMatcher = pedidoPattern.matcher(descriminassao);

        // Substituir o número do pedido
        if (pedidoMatcher.find()) {
            descriminassao = pedidoMatcher.replaceFirst("NUMERO DO PEDIDO: " + novoPedido);
        }

        return descriminassao;
    }
}
