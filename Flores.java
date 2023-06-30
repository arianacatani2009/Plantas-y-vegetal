public class Flores extends verduras{
    String autotrofos;

    public Flores(String tipo,int tiempo, String nombre){
        super(tipo,tiempo,nombre);
        this.autotrofos=autotrofos;
    }

    public String getAutotrofos() {
        return autotrofos;
    }

    public void setAutotrofos(String autotrofos) {
        this.autotrofos = autotrofos;
    }
}
