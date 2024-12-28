package accesodatos;

//cuando implementas una interface se escribe asi
//tambien al implementace debes implementar todos los metodos
public class ImplementecionMySql implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insetar desde MySql");

    }

    @Override
    public void listar() {

        System.out.println("Listar desde MySql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MySql");

    }

    @Override
    public void delete() {

        System.out.println("delete desde MySql");
    }

}
