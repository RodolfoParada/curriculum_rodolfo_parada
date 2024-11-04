package cv.rodolfo.curriculum_rodolfo_parada.servicio;

import cv.rodolfo.curriculum_rodolfo_parada.modelo.Curriculum;

public interface ICurriculumServicio {
    // Método que devuelve el currículum completo con datos en duro
    Curriculum obtenerCurriculum();

    // Método que devuelve solo la experiencia en duro
    String obtenerExperiencia();

    // Método que devuelve solo la formación en duro
    String obtenerFormacion();

    // Método que devuelve solo los proyectos en duro
    String obtenerProyectos();
}
