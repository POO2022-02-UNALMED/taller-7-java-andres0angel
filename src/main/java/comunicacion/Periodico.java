package comunicacion;

public class Periodico extends Escrito{
    private String fecha;
    private String primicia;
    private String interpretacion;

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setPrimicia(String primicia) {
        this.primicia = primicia;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getPrimicia() {
        return primicia;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia,
			String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}

    

    @Override
    int palabrasTotales(int palabrasPagina) {
        return getPaginas()*10*palabrasPagina;
    }

    @Override
    String interpretacion() {
        return this.interpretacion;
    }

    @Override
    public String toString() {
        return this.getOrigen() +"\n"+ this.getTitulo() +"\n"+ this.getAutor() +"\n"+ this.getPaginas() +"\n"+ this.primicia +"\n"+ 
                this.fecha
                ;
    }
}
