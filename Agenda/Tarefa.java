import java.text.ParseException;

public class Tarefa extends ItemAgenda {
    
    Tarefa(String dataInicial, String nome, String dataFinal) throws ParseException{
        super(dataInicial, nome, dataFinal);
    }
}