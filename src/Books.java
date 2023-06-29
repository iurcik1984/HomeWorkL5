public class Colectii {
    private int id;
    private String denumirea;
    private String autor;
private int anul;
private String editura;
private int nrPagini;
private double pretul;

    public Colectii(int id, String denumirea, String autor, int anul, String editura, int nrPagini, double pretul) {
        this.id = id;
        this.denumirea = denumirea;
        this.autor = autor;
        this.anul = anul;
        this.editura = editura;
        this.nrPagini = nrPagini;
        this.pretul = pretul;
    }

    public Colectii() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenumirea() {
        return denumirea;
    }

    public void setDenumirea(String denumirea) {
        this.denumirea = denumirea;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnul() {
        return anul;
    }

    public void setAnul(int anul) {
        this.anul = anul;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    public double getPretul() {
        return pretul;
    }

    public void setPretul(double pretul) {
        this.pretul = pretul;
    }

    @Override
    public String toString() {
        return "Colectii{" +
                "id=" + id +
                ", denumirea='" + denumirea + '\'' +
                ", autor='" + autor + '\'' +
                ", anul=" + anul +
                ", editura='" + editura + '\'' +
                ", nrPagini=" + nrPagini +
                ", pretul=" + pretul +
                '}';
    }
}
