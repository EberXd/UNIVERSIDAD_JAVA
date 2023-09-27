
package domain;




public class Gerente extends Empleado{
    
  
    
    private String departamento;
    
    
    public Gerente(String nombre, double sueldo, String departamento){
        
        //La clase al extender de empleado requiere los dos argumentos del constructor
        //de empleado
        //esos dos argumentos esel nombre y el sueldo
        //los cuales ya vamos  pasar con super
        //su nombre tecnico esinicializar el constructor de la clase padre
        super(nombre,sueldo);
        this.departamento=departamento;
        
        
        
        
        
        
    }
    
    
    //La sobreescritura consiste simplemente en volver a escribir un metodo
    //de la clase padre,pero con ciertas modificaciones
    //en este caso le agregamos al metodo un atributo que desamos que imprima
    //El cual no lo tenia la clase padre
    
    //es importante mencionar que no  se puede sobreescribir el mtetodo con
    //mayor seguridad, debe ser igual o menor la seguridad para aplicar
    //polimorfismo y tambien deben llamarse exactamente igual
    @Override
     public String obtenerDetalles() {
        
        //Aqui con super ejecutamos el metodo original y solo agregamos
        // el atributo de departamento
        return super.obtenerDetalles() +", Departamento: "+ this.departamento;

    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
    
    
}
