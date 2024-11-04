package cv.rodolfo.curriculum_rodolfo_parada.controlador;


import cv.rodolfo.curriculum_rodolfo_parada.modelo.Curriculum;
import cv.rodolfo.curriculum_rodolfo_parada.modelo.FormularioContacto;
import cv.rodolfo.curriculum_rodolfo_parada.servicio.ICurriculumServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//localhost:8080/quienSoy
@RequestMapping("/quienSoy")
@CrossOrigin(origins = {"http://localhost:5173", "https://mi-app.vercel.app"})
public class CurriculumControlador {

    @Autowired
    private ICurriculumServicio curriculumServicio;



    // Endpoint para obtener el currículum completo
    @GetMapping
    public Curriculum obtenerCurriculum() {
        return curriculumServicio.obtenerCurriculum();
    }

    // Endpoint para obtener solo la experiencia
    @GetMapping("/experiencia")
    public String obtenerExperiencia() {
        return curriculumServicio.obtenerExperiencia();
    }

    // Endpoint para obtener solo la formación
    @GetMapping("/formacion")
    public String obtenerFormacion() {
        return curriculumServicio.obtenerFormacion();
    }

    // Endpoint para obtener solo los proyectos
    @GetMapping("/proyectos")
    public String obtenerProyectos() {
        return curriculumServicio.obtenerProyectos();
    }




}