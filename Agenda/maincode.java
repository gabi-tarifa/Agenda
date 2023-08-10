import java.text.ParseException;

public class maincode {
    public static void main(String[] args) throws Exception, IndexOutOfBoundsException, ParseException { //O modelo de data a seguir é aaaa/mm/dd para melhor performance da organização por data
        Agenda agenda = new Agenda();

        Lembrete testeAgenda = new Lembrete("2023/09/08", "Teste Agenda", "2023/09/09");
        Evento aniversario = new Evento("2017/05/29", "Aniversário", "2017/05/29");
        Tarefa lista = new Tarefa("2023/08/15", "Lista Matemática", "2023/08/31");

        try{
            agenda.agendar(aniversario);
            agenda.agendar(testeAgenda);
            agenda.agendar(lista);

            agenda.agendar(aniversario);

            agenda.cancelar(lista);
            agenda.cancelar(lista);


        } catch (Exception jaAgendado){
            System.out.println(jaAgendado.getMessage());
        }
        agenda.visualizar();

    }
}