package comunicacion;

public class Libro extends Escrito {
    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    public Libro(String origen, String titulo, String autor, int paginas,String co_autor, String editorial, String edicion, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.co_autor = co_autor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.interpretacion = interpretacion;
    }

    

    @Override
    int palabrasTotales(int palabrasPagina) {
        return getPaginas()*2*palabrasPagina;
    }

    @Override
    String interpretacion() {
        return getInterpretacion();
    }

    @Override
    public String toString() {
        return this.getOrigen() +"\n"+ this.getTitulo() +"\n"+ this.getAutor() +"\n"+ this.getPaginas() +"\n"+ this.getCo_autor()
                +"\n"+ this.getEditorial()+"\n"+ this.getEdicion();
    }

    public String getCo_autor() {
        return co_autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setCo_autor(String co_autor) {
        this.co_autor = co_autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    
    
}
