package mavesa.jornada20220805.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
@Entity
public class Cliente {
    @Id
    @Column(length = 11)
    private String rutCli;
    @Column(length = 100)
    private String nombreCli;
}
