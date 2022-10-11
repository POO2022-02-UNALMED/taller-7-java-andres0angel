package comunicacion;

public class Alfabeto extends Pictograma {
    private String[] letras;
    private String interpretacion;
    public Alfabeto(String origen, String[] letras, String interpretacion){
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }
    
    
@Override
    public String interpretacion(){
        return interpretacion;
    }    
    
    public int cantidadLetras(){
        return letras.length;
    }
    public String[] getLetras(){
        return letras;
    }
    
    public void setInterpretacion(String interpretacion){
        this.interpretacion = interpretacion;
    }
    
    
    public void setLetras(String[] letras){
        this.letras = letras;
    }
    
    
    
    
    
    @Override
    public String toString(){
        String nuevasLetras = "";
        int cantid = 0;
        int j;
        for (j=0;j<letras.length;j++){
            cantid+=1;
            if (cantid==letras.length){    
                nuevasLetras+=letras[j];
            }else{nuevasLetras+=letras[j]+", ";}
        }
        return nuevasLetras;
    }
    
}
