package mavesa.jornada20220805.entidad;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
@Entity
public class Factura {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int numFact;
    @ManyToOne
    private Cliente cliFact;
    private Date fechaFact;
    @OneToMany(mappedBy = "numFact")
    @JsonIgnoreProperties("numFact")
    private List<DetalleFactura> detalleFact;
}
