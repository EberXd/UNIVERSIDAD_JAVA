
package domain;





public enum TipoEscritura {
    
    CLASICO("A mano"),
    MODERNO("Digital");
    
    
    
    private final String descripcion;
    
    
    private TipoEscritura(String desripcion){
        
        this.descripcion=desripcion;
        
    }

    
    
    
    public String getDescripcion() {
        return descripcion;
    }
    
    
    
    
    
    
    
}
