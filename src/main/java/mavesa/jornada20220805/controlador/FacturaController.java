package mavesa.jornada20220805.controlador;

import mavesa.jornada20220805.entidad.Factura;
import mavesa.jornada20220805.repo.IFacturaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/facturacion")
public class FacturaController {
    @Autowired
    private IFacturaRepo ifrepo;

    @GetMapping("/listafact")
    public Iterable<Factura> listafact() {
        return ifrepo.findAll();
    }

    @GetMapping("/Listauna/{numfactura}")
    public Factura una(@PathVariable("numfactura") int numfactura)  throws Exception{
        if(ifrepo.findById(numfactura).isPresent()==false) {
            // genero un error (finaliza la funcion)
            throw new Exception("La factura no existe");
        }
        return ifrepo.findById(numfactura).get();
    }
}
