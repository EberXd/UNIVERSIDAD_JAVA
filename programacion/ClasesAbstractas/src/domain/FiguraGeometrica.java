
package domain;



//cuando una clase contiene un metodoabstracto, toda la clase debe ser abstracta

public abstract class FiguraGeometrica {
    
    protected String tipoFigura;
    
    
    
    
    protected FiguraGeometrica(String tipoFigura){
        
        
        this.tipoFigura=tipoFigura;
        
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Los metodos abstractos no requieren llaves
    public abstract void dibujar();
    ////////////////////////////////////////////////////////////////////////////
    
    
    public String getTipoFigura() {
        return this.tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    
    
    
    
    
    
    
}
