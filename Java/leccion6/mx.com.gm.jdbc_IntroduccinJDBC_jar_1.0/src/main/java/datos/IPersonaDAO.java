package datos;

import domain.PersonaDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author eber
 */
public interface IPersonaDAO {

    public List<PersonaDTO> seleccionar();

    public int insertar(PersonaDTO persona) throws SQLException;

    public int actualizar(PersonaDTO persona) throws SQLException;

    public int delete(PersonaDTO persona) throws SQLException;
}
