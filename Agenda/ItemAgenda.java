import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ItemAgenda implements Comparable<ItemAgenda> {
    private String dataInicial, nome, dataFinal;
    private Date dataModel;
    private boolean agendado = false;



    public ItemAgenda(String dataInicial, String nome, String dataFinal) throws ParseException {
        this.dataInicial = dataInicial;
        this.nome = nome;
        this.dataFinal = dataFinal;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        this.dataModel = sdf.parse(dataInicial);
    }

    public String getDataInicial() {
        return dataInicial;
    }

    public String getNome() {
        return nome;
    }

    public String getDataFinal() {
        return dataFinal;
    }
    
    public boolean isAgendado() {
        return agendado;
    }
    public void setAgendado(boolean agendado) {
        this.agendado = agendado;
    }

    @Override
    public int compareTo(ItemAgenda other) {
        return this.dataModel.compareTo(other.dataModel);
    }

}