package mavesa.jornada20220805.repo;

import mavesa.jornada20220805.entidad.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteRepo extends CrudRepository<Cliente,String> {
}
