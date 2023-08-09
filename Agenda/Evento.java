import java.text.ParseException;

public class Evento extends ItemAgenda{
    Evento(String dataInicial, String nome, String dataFinal) throws ParseException{
        super(dataInicial, nome, dataFinal);
    }
}