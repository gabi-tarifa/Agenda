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

    public void cancelar(ItemAgenda item) {
        agenda.remove(item);
    }

    public void agendar(ItemAgenda item) throws Exception {
        if(item.isAgendado()){
            throw new Exception("Evento já agendado", null);
        }
        agenda.add(item);
        item.setAgendado(true);
    } 
    public void alterar(ItemAgenda item, ItemAgenda novoItem){
        agenda.add(novoItem);
        int z = agenda.indexOf(item);
        int x = agenda.indexOf(novoItem);
        System.out.println("Alteração de evento: \nSai: " + agenda.get(z).getNome() + "; Entra: " + agenda.get(x).getNome());
        agenda.remove(item);
    }
}