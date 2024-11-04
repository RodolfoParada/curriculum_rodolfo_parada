package cv.rodolfo.curriculum_rodolfo_parada.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String fecha;
    public String empresa;
    public String cargo;
    public List<String> funciones;
    public List<String> logros;
    public String logo;
}
