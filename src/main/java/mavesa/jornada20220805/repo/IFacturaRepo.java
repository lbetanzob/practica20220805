package mavesa.jornada20220805.repo;

import mavesa.jornada20220805.entidad.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaRepo extends CrudRepository<Factura,Integer> {
}
