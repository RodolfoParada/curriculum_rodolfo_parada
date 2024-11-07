package cv.rodolfo.curriculum_rodolfo_parada.configuracion;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Configuracion implements WebMvcConfigurer {

        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**") // Aplica a todas las rutas
                    .allowedOrigins("http://localhost:5174", "https://cv-rodolfo-parada.vercel.app") // Orígenes permitidos
                    .allowedMethods("GET", "POST", "PUT", "DELETE") // Métodos HTTP permitidos
                    .allowedHeaders("*") // Permitir todos los headers
                    .allowCredentials(true); // Habilita cookies o autenticación si es necesario
        }
    }

