package comunicacion;

public class Alfabeto extends Pictograma{
    private static String[] letras;
    private String interpretacion;

    public Alfabeto(String[] letras, String interpretacion, String origen) {
        super(origen);
        Alfabeto.letras = letras;
        this.interpretacion = interpretacion;
    }
    
    

    @Override
    String interpretacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    @Override
    public String toString() {
        String nuevasLetras = null;
        for (int i=0 ; i<letras.length-1; i++){
            nuevasLetras+=letras[i]+", ";
        }
        
        nuevasLetras+=letras[letras.length-1];

        return nuevasLetras;
    }
    
    public int cantidadLetras(){
        return letras.length;
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
