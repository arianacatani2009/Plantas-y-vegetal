public class verduras extends plantas{
    String autotrofos;

    public verduras (String tipo, int tiempo, String nombre){
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

