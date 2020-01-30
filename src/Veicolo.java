public class Veicolo
{
    static int count=0;

    private int codice;
    private String targa;
    private String marca;
    private String modello;
    private int numPosti;

    public Veicolo(String targa, String marca, String modello, int numPosti)
    {
        count++;
        codice=count;
        setTarga(targa);
        setMarca(marca);
        setModello(modello);
        setNumPosti(numPosti);
    }

    public int getCodice() {
        return codice;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getNumPosti() {
        return numPosti;
    }

    public void setNumPosti(int numPosti) {
        this.numPosti = numPosti;
    }

    public String toString() {
        return "Veicolo{" +
                "codice='" + codice + '\'' +
                ", targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", numPosti=" + numPosti +
                '}';
    }
}
