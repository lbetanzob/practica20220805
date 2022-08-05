package mavesa.jornada20220805.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idProdu;
    @Column(length = 100)
    private String nombreProdu;
    @ManyToOne
    private Categ categProdu;
}
