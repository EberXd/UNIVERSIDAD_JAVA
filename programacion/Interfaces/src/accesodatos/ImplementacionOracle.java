
package accesodatos;


public class ImplementacionOracle implements IAccesoDatos{
    
    ///////////////////////////////////////////////////////
    //////
    //sE DEBEN IMPLEMENTAR TODOS LOS METODOS DE UNA CLASE INTERFACE
    //DE CASO CONTRARIO NOS MARCA ERROR EL CODIGO SI SE OMITE ALGUNO
    @Override
    public void insertar() {
        
        System.out.println("Insetar desde ORACLE");
    }

    @Override
    public void listar() {
        
        System.out.println("listar desde ORACLE");
    }

    @Override
    public void actualizar() {
        
        System.out.println("ACTUALIAR desde ORACLE");
    }

    @Override
    public void delete() {
        
        System.out.println("DELETE desde ORACLE");
    }
    
}
