package mavesa.jornada20220805.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
@Entity
public class DetalleFactura {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idDetFac;
    @ManyToOne
    private Product prodDetfac;
    private int cantDetFac;
    private int precioDetFac;
    @ManyToOne
    private Factura numFact;

}
