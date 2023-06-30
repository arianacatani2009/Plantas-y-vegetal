public class vegetal extends plantas{
    String autotrofos;

    public vegetal (String tipo, int tiempo, String nombre, String autotrofos){
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


