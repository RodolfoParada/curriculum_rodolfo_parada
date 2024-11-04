package cv.rodolfo.curriculum_rodolfo_parada.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Curriculum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String descripcionUno;
    public String descripcionDos;
    public String descripcionTres;
    public String descripcionCuatro;
    public String descripcionCinco;
    public String descripcionSeis;

}
