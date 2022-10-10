package comunicacion;

public class Alfabeto extends Pictograma{
    private static String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        Alfabeto.letras = letras;
        this.interpretacion = interpretacion;
    }
    
    

    @Override
    String interpretacion() {
        return getInterpretacion();
    }
    
    
    
    @Override
    public String toString() {
        String nuevasLetras = "";
        for (int i=0 ; i<this.letras.length-1; i++){
            nuevasLetras+=this.letras[i]+", ";
        }
        
        nuevasLetras+=this.letras[this.letras.length-1];

        return nuevasLetras;
    }
    
    public int cantidadLetras(){
        return this.letras.length;
    }
    
    
    public  String[] getLetras() {
        return letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setLetras(String[] letras) {
        Alfabeto.letras = letras;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    
    
    
    
    
    
}
