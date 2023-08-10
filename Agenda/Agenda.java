import java.util.ArrayList;
import java.util.Collections;

public class Agenda {
    private ArrayList<ItemAgenda> agenda = new ArrayList<>();

    public ArrayList<ItemAgenda> getAgenda() {
        return agenda;
    }

    public void setAgenda(ArrayList<ItemAgenda> agenda) {
        this.agenda = agenda;
    }

    public void visualizar() {
        Collections.sort(agenda);
        for(int i = 0; i<agenda.size(); i++){
            System.out.println("\nNome do Evento: " + agenda.get(i).getNome() + "; \nHorário: " + agenda.get(i).getDataInicial() + " - " + agenda.get(i).getDataFinal() +"\n");
        }
    }

    public void cancelar(ItemAgenda item) throws IndexOutOfBoundsException {
        if(item.isCancelado()){
            throw new IndexOutOfBoundsException("Evento já cancelado");
        }
        agenda.remove(item);
        item.setCancelado(true);
    }

    public void agendar(ItemAgenda item) throws Exception {
        if(item.isAgendado()){
            throw new Exception("Evento já agendado", null);
        }
        agenda.add(item);
        item.setAgendado(true);
    } 
}