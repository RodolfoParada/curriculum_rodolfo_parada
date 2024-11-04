package cv.rodolfo.curriculum_rodolfo_parada.repositorio;

import cv.rodolfo.curriculum_rodolfo_parada.modelo.Curriculum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurriculumRepositorio extends JpaRepository<Curriculum, String> {
}
