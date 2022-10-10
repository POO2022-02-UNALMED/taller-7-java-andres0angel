package comunicacion;

public class Fabula extends Escrito{
    private String enseñanza;
    private String interpretacion;

    public void setEnseñanza(String enseñanza) {
        this.enseñanza = enseñanza;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String getEnseñanza() {
        return enseñanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public Fabula(String enseñanza, String interpretacion, String origen, String titulo, String autor, int paginas) {
        super(origen, titulo, autor, paginas);
        this.enseñanza = enseñanza;
        this.interpretacion = interpretacion;
    }

    

    @Override
    int palabrasTotales(int palabrasPagina) {
        return getPaginas()*1*palabrasPagina;
    }

    @Override
    String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return getOrigen() +"\n"+ getTitulo() +"\n"+ getAutor() +"\n"+ getPaginas() +"\n"+ getEnseñanza() ;
    }
}
