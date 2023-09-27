/*
    las interfaces son muy similares a las clases abstractas
    con la diferencia de que cuando defines una interface todos sus metodos
    pasan a ser abstractos, tambien sus atributos se vuelven constants
    son publicos se escriben en mayusculas y no cmbia su valor

    las interfaces se usan mas por su comportamiento relacionado a las demas 
    clases, cuando la relacion es de herencia es mehor usar clase y metodo 
    abstracto,cuando la relacion es por comportamiento lo mejor es usar
    interface, por ejemplo las clases de oracle y SQL 
    
    UNA INTRFACE NO TIENE CONSTRUCTORES
 */

package accesodatos;

/**
 *
 * @author eber  28/06/23
 */
////A UNA CLASE TIPO INTERFACE SE LE ANTEPONE LA I PARA DIFERENCIARLA
//I DE INTERFACE
public interface IAccesoDatos {
    
    //CONSTANTE PUBLIC STATIC FAINAL
    int MAX_REGISTRO = 10;
    
    
    
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void delete();
    
    
    
}
