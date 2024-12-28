




package Enumeracion;



public enum Continentes {
    
    //////////////CONTINENTES///////////
    //Los numeros delante de los elementos se le llaman atributos
    AFRICA(53, "1.2 billones"),
    EUROPA(46,"50 millones"),
    ASIA(44,"6.9 billones"),
    AMERICA(34,"84 Billones"),
    OCEANIA(14,"500 millones");//Se pone el ; para cuando se va a seguir
    //agregando elementos a la enumeracion
    
    private final int paises;
    private final String habitantes;
    //Constructor para poder utilizar los elementos con argumentos
    //para poder recibir atributos de los elementos se requiere de este,
    //en el siguiete constructor se reciben los int y string
    Continentes(int paises, String habitantes){
        //Sebes inicializar los atributos 
    this.paises=paises; 
    this.habitantes=habitantes;
        
    }
    
    //Despues agregamos los get para acceder a los atributos
    //ya que los pusimos como privados
    public int getPaises(){
        
        return this.paises;
        
    }
    
    public String getHabitantes(){
        return this.habitantes;
        
    }
    
    
}
