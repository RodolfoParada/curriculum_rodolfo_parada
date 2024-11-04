package cv.rodolfo.curriculum_rodolfo_parada.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FormularioContacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public String nombre;
    public String apellido;
    public String telefono;
    public String nombreEmpresa;
    public String email;
    public String mensaje;

}
