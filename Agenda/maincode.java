import java.text.ParseException;

public class maincode {
    public static void main(String[] args) throws Exception, ParseException { //O modelo de data a seguir é aaaa/mm/dd para melhor performance da organização por data
        /*
        O jeito quer o programa deve decorrer é simples:
        - Instancie as classes quantas vezes quiser, mas não esqueça de instanciar a classe Agenda uma vez para ter a sua lista para agendar e fazer o que tiver que fazer;
        - Coloque todos os métodos no interior de try, assim não se causará nenhum bug;
        - Bom divertimento usando o programa 😘😘
        */
        
        Agenda agenda = new Agenda();

        Lembrete testeAgenda = new Lembrete("2023/09/08", "Teste Agenda", "2023/09/09");
        Evento aniversario = new Evento("2017/05/29", "Aniversário", "2017/05/29");

        try{
            agenda.agendar(aniversario);
            agenda.agendar(testeAgenda);

            agenda.agendar(aniversario);
            
            agenda.visualizar();
            agenda.alterar(testeAgenda, new Lembrete("2023/10/08", "Teste Final da Agenda", "2023/10/09"));
            agenda.visualizar();
        } catch (Exception jaAgendado){
            System.out.println(jaAgendado.getMessage());
        }
    }
}