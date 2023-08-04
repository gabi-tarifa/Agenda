public class Lembrete extends Agenda {
    private int dia0, mes0, ano0, hora0, minuto0;
    private int[] data0 = new int[5];
    private int dia, mes, ano, hora, minuto;
    private int[] data = new int[5];
    private String nome;

    public Lembrete(int dia0, int mes0, int ano0, int hora0, int minuto0, String nome, int dia, int mes, int ano, int hora, int minuto){
        this.ano0 = ano0;
        this.mes0 = mes0;
        this.dia0 = dia0;
        this.hora0 = hora0;
        this.minuto0 = minuto0;
        this.nome = nome;
        this.dia = dia;  
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;

        this.data0[0] = dia0;
        this.data0[1] = mes0;
        this.data0[2] = ano0;
        this.data0[3] = hora0;
        this.data0[4] = minuto0;

        this.data[0] = dia;
        this.data[1] = mes;
        this.data[2] = ano;
        this.data[3] = hora;
        this.data[4] = minuto;
    }

    public void setDia0(int dia0){
        this.dia0 = dia0;
    }
    public void setMes0(int mes0){
        this.mes0 = mes0;
    }
    public void setAno0(int ano0){
        this.ano0 = ano0;
    }
    public void setHora0(int hora0){
        this.hora0 = hora0;
    }
    public void setMinuto0(int minuto0){
        this.minuto0 = minuto0;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public void setHora(int hora){
        this.hora = hora;
    }
    public void setMinuto(int minuto){
        this.minuto = minuto;
    }

    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }
    public int getHora(){
        return hora;
    }
    public int getMinuto(){
        return minuto;
    }
    public int getDia0(){
        return dia0;
    }
    public int getMinut0(){
        return minuto0;
    }
    public int getHora0(){
        return hora0;
    }
    public int getMes0(){
        return mes0;
    }
    public int getAno0(){
        return ano0;
    }
    public String getNome(){
        return nome;
    }
}