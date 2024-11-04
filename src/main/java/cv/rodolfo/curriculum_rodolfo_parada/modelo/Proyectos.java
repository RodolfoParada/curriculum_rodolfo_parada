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
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String nombreProyecto;
    public String descripcionProyecto;
    public String enlaceProyecto;


}
