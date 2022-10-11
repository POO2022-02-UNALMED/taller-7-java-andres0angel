package comunicacion;

public class Alfabeto extends Pictograma{
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion){
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }
    
    

    @Override
    String interpretacion() {
        return this.interpretacion;
    }
    
    
    
    @Override
    public String toString(){
        String totalLetras = null;
        int cantid = 0;
        int j;
        for (j=0;j<letras.length;j++){
            cantid+=1;
            if (cantid==letras.length){    
                totalLetras+=letras[j];
            }else{totalLetras+=letras[j]+", ";}
        }
        return totalLetras;
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
        this.letras = letras;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    
    
    
    
    
    
}
