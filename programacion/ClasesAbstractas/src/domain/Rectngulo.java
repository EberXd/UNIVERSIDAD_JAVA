
package domain;




public class Rectngulo extends FiguraGeometrica {

    
    
    
    //////////////////////////////////////////////////////////////////////////
    //////////////////////////////////CONSTRUCTOR////////////////////////////
    public Rectngulo(String tipoFigura) {
        //SE INCIALIZA EL ATRIBUTO DE LA CLASE PADRE
        super(tipoFigura);
    }

    
    
    ///////////////////////////////IMLEMENTACION DEL METODO ABSTRACTO///////////
    ///////////////////////////////////////////////////////////////////////////
    //Cuando se usa por primera vez no es sobreescritura,solo es una implementacion
    //en este caso ya no debes ponerlo como clase abstracta
    @Override
    public void dibujar() {
        ////////////////////////////////////con estos metodos obtienes el nombre de la clase
        //como un tipo String
        System.out.println("Se imprime un:"+this.getClass().getSimpleName());
        
    }
   
    
    
    
    
    
    
    
    
    
    
}
