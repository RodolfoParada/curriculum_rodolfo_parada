package cv.rodolfo.curriculum_rodolfo_parada.servicio;

import com.fasterxml.jackson.databind.ObjectMapper;
import cv.rodolfo.curriculum_rodolfo_parada.modelo.Curriculum;
import cv.rodolfo.curriculum_rodolfo_parada.modelo.Experiencia;
import cv.rodolfo.curriculum_rodolfo_parada.modelo.Formacion;
import cv.rodolfo.curriculum_rodolfo_parada.modelo.Proyectos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CurriculumServicio implements ICurriculumServicio{

    // @Autowired
   // public CurriculumRepositorio curriculumRepositorio;
    @Autowired
    private JavaMailSender emailSender;

    @Override
    public Curriculum obtenerCurriculum() {
        return new Curriculum(
                obtenerDescripcionUno(),
                obtenerDescripcionDos(),
                obtenerDescripcionTres(),
                obtenerDescripcionCuatro(),
                obtenerDescripcionCinco(),
                obtenerDescripcionSeis()

        );
    }

    private String obtenerDescripcionUno() {
        return  "En la pandemia, tuve que tomar decisiones importantes y una de ellas fue reinventarme, \n" +
                " En ese periodo, descubrí que la programación era una gran oportunidad para conseguir  \n" +
                "empleo. Todo comenzó en noviembre de 2020, cuando inicié mi primer Bootcamp en “desarrollo \n" +
                " de aplicaciones móviles android trainne”. Luego, en enero de 2022, comencé mi segundo  \n" +
                "Bootcamp en \"desarrollo de aplicaciones full stack java trainne\". Finalmente, en marzo\n" +
                "2023, complete mi último Bootcamp en “desarrollo de aplicaciones full stack javascript trainne”. \n \n"  +
                 "Actualmente, sigo aprendiendo programación y estoy decidido a continuar por este camino.\n" +
                "He aprendido a manejar la frustración y el estrés mediante métodos como la meditación, la\n" +
                " respiración y yoga. Tengo mucha energía de seguir aprendiendo y lograr la profesionalización\n" +
                " en esta área del conocimiento. ";

    }

    private String obtenerDescripcionDos() {
        return  "Los conocimientos que adquirido desde el 2020 son: \n" +
                "\n" +
                "✅ Habilidades y conocimientos en programación\n" +
                " adquiridos desde el 2020. \n" +
                "• Html.\n" +
                "• Lenguaje Java. \n" +
                "• Lenguaje JavaScript. \n" +
                "• Lenguaje Spring Boot.(Api rest) \n" +
                "• Framework Vue.js. \n" +
                "• Framework Node.js. \n" +
                "• CSS. \n" +
                "• Bootstrap.  \n" +
                "• MySQL.  \n" +
                "• GitHub.(GitFLow) \n" +
                "• GitLab.\n" +
                "• SourceTree. \n" +
                "• GitKraken. \n" +
                "• Jira. \n" +
                "• Scrum Máster (Certificación Profesional). ";
    }

    private String obtenerDescripcionTres() {
                     return     "Mi profesión es Ingeniero en administración, mención, marketing y gestión comercial.\n" +
                                "En mayo de 2020, realicé un diplomado de ”dirección comercial y ventas”. Posteriormente,\n" +
                                "En enero de 2022, complete un diplomado en “marketing digital y gestión estratégica”. \n " +
                                "Además, cuento con un título de \"técnico nivel superior en administración de RR.HH.\" ";

    }

    private String obtenerDescripcionCuatro() {
        return         "✅Habilidades adicionales en Marketing: \n" +
                "• Planificación estratégica, táctica y operativa. \n" +
                "• SEM y SEO. \n" +
                "• Análisis de datos. \n" +
                "• Investigación de Mercados. \n" +
                "• KPI'S\n" +
                "• Negociación. \n" +
                "• Relaciones Públicas. \n" +
                "• Gestión de Proyectos.";


    }

    private String obtenerDescripcionCinco() {
        return   "En conclusión, he diversificado mis habilidades en diferentes áreas profesionales con el objetivo \n " +
                 "de aumentar mis oportunidades de empleo en el mercado. Actualmente, tengo la puerta abierta para \n " +
                 "postularme a puestos relacionados tanto con el marketing como con la programación.";
    }

    private String obtenerDescripcionSeis() {
        return

                "Desarrollador Full Stack Junior con experiencia en Spring Boot, JavaScript y frameworks como\n" +
                "Node.js, Vue.js, React y Angular. Además, cuento con una certificación de Scrum Máster que\n" +
                "respalda mi capacidad para trabajar en equipos ágiles.\n" +
                "Tengo sólidos conocimientos en el patrón Modelo Vista Controlador (MVC) y en la creación\n" +
                "de API REST para aplicaciones web. Me mantengo en constante aprendizaje y actualización,\n" +
                "con el objetivo de mejorar mis habilidades y adaptarme a nuevas tecnologías.";
    }




    // Método que devuelve solo la experiencia en duro
    @Override
    public String obtenerExperiencia() {
        try {
            // Crear instancias de Experiencia
            Experiencia exp1 = new Experiencia(
                    "Sept 2022- Jul 2024",
                    "ActiveIt Consultores",
                    "Consultor",
                    Arrays.asList(
                            "➢ Utilicé Vue.js en Frontend y usé la metodología Scrum.",
                            "➢ Utilicé   Git junto con GitKraken y Sourcetree para gestionar el \n " +
                                    "control de versiones del código fuente de manera eficiente."
                    ),
                    Arrays.asList(
                            "➢ Obtuve experiencia practica en el uso de Vue.js y Git en un entorno colaborativo y profesional  ."
                    ),
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT1lOxwKzqWGNKKfGxVMIE6QNkO5MZKecULqE60VWEuT7vAEp-gQbWPnk6-XYX5PLqer9g&usqp=CAU"
            );

            Experiencia exp2 = new Experiencia(
                    "Ene 2022 - May 2022",
                    "Blockey ltda",
                    "Diseño estrategia Comercial.",
                    List.of(
                            "➢ Desarrollé plan comercial y gestioné contactos con clientes potenciales."
                    ),
                    List.of(
                            "➢ Coordiné con los plazos indicados por CORFO."
                    ),
                    "data:image/png;base64,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"
            );

            Experiencia exp3 = new Experiencia(
                    "Ago 2020 - Dic 2021",
                    "Castillo gráfico ltda",
                    "Jefe de Proyectos",
                    Arrays.asList(
                                            "➢ Desarrollé e implementé un Plan Comercial integral,\n" +
                                            " enfocándome en estrategias que resaltaran las ventajas\n" +
                                            " competitivas y la propuesta de valor, lo que resultó en\n" +
                                                    " resultados sobresalientes."

                    ),
                    Arrays.asList(
                                            "➢ Desarrollé un plan de marketing integral para un nicho de mercado,\n" +
                                            " que incluyó estrategias de fidelización, logrando un aumento del 32%\n" +
                                            " en las ventas y un incremento del 90% en la frecuencia de compra en 2018,\n" +
                                                    " seguido de un crecimiento del 25% en 2019."


                    ),
                    "https://media.licdn.com/dms/image/v2/C4D03AQHHCd3RY9gX7Q/profile-displayphoto-shrink_200_200/profile-displayphoto-shrink_200_200/0/1517883177324?e=1733356800&v=beta&t=vQHGJYql_RZFE4_pPthu9EXH3l87YyuGzLzTCxBFhNc"
            );

            // Crear una lista de experiencias
            List<Experiencia> experiencias = Arrays.asList(exp1, exp2, exp3);

            // Convertir la lista a JSON
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(experiencias); // Devuelve el JSON como String

        } catch (Exception e) {
            e.printStackTrace();
            return "[]"; // Devuelve un arreglo vacío en caso de error
        }

    }

    // Método que devuelve solo la formación en duro
    @Override
    public String obtenerFormacion() {
        try {
            // Crear instancias de Experiencia
            Formacion curso1 = new Formacion(
                    "[Octubre 2024] Duoc UC",
                    "Diplomado en UX para el desarrollo de productos digitales. En curso.",
                    "https://www.alog.cl/wp-content/uploads/2021/10/Logo-Duoc-UC.png"

            );
            Formacion curso2 = new Formacion(
                    "[Mar 2024] IPChile",
                    "Técnico de nivel superior analista programador computacional.En curso",
                    "https://saba.cl/wp-content/uploads/2021/04/logos-ipchile.png"
            );

            Formacion curso3 = new Formacion(
                    "[Mar 2023 - Ago 2023] Otec Edutecno",
                    "Bootcamp desarrollo de aplicaciones full-stack javascript trainee.\n" +
                            "duración 472 horas.",
                    "https://getonbrd-prod.s3.amazonaws.com/uploads/users/logo/9007/logo.png"

            );
            Formacion curso4 = new Formacion(
                    "[Ago 2022 - Nov 2022]  Instituto Profesional  Aiep",
                    "Diplomado marketing digital y gestión estratégica.\n" +
                            "duración 90 horas.",
                    "https://cdn.domestika.org/c_pad,dpr_auto,f_auto,h_150,q_auto,w_150/v1587589565/school-logos/000/018/767/18767-original.png?1587589565"

            );
            Formacion curso5 = new Formacion(
                    "[Ago 2022 - Nov 2022]  Instituto Profesional Aiep",
                    "Bootcamp desarrollo de aplicaciones full stack java trainee.\n" +
                            "duración 480 horas.",
                    "https://cdn.domestika.org/c_pad,dpr_auto,f_auto,h_150,q_auto,w_150/v1587589565/school-logos/000/018/767/18767-original.png?1587589565"

            );
            Formacion curso6 = new Formacion(
                    "[Ago 2022 - Nov 2022] Alura Latam.",
                    "Bootcamp full stack frontend. duración 522 horas.\n",
                    "https://s3.amazonaws.com//beta-img.b2bstack.net/uploads/production/product/product_image/2436/small_Alura.jpg"


            );
            Formacion curso7 = new Formacion(
                    "[Nov 2020 - May 2021] Duoc Uc",
                    "Bootcamp desarrollo de aplicaciones móviles android trainee.\n" +
                            "duración 480 horas.",
                    "https://www.alog.cl/wp-content/uploads/2021/10/Logo-Duoc-UC.png"

            );
            Formacion curso8 = new Formacion(
                    "[May 2020 - Nov 2020] Universidad San Sebastián.",
                    "Diplomado de dirección comercial y ventas.",
                    "https://www.learnchile.cl/wp-content/uploads/2024/04/learnchile-1.jpg"
            );



                        Formacion curso9 = new Formacion(
                    "[Mar 2013 - Nov 2017] Universidad Mayor.",
                    "Ingeniería en administración mención marketing y gestión comercial.\n" +
                            "titulado.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSp-zXxGL1CQ1sm6qXg2yOePUCvwTZlMRxFakuAtVJhQqULW5JTOa5br3vcpIL5RqsRid4&usqp=CAU"

            );
            Formacion curso10 = new Formacion(
                    "[Mar 2010 - Ago 2012] Escuela de comercio de santiago.",
                    "Técnico nivel superior en administración recursos humanos.\n" +
                            "titulado.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSsjDwp-6mfJIbjzG6s1AiJkerCLMGjcybLgcqnxbDsBjzMYmO4Nw5lcZ6SwhAtuA8sU4c&usqp=CAU"

            );
            // Crear una lista de experiencias
            List<Formacion> formaciones = Arrays.asList(curso1, curso2, curso3, curso4, curso5, curso6, curso7, curso8, curso9,curso10);

            // Convertir la lista a JSON
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(formaciones); // Devuelve el JSON como String

        } catch (Exception e) {
            e.printStackTrace();
            return "[]"; // Devuelve un arreglo vacío en caso de error
        }

    }

    // Método que devuelve solo los proyectos en duro
    @Override
    public String obtenerProyectos() {
        try {
            // Crear instancias de Experiencia
            Proyectos proyecto1 = new Proyectos(
                    1,
                    "Proyecto Batatabit",
                    "Descripción: Es un proyecto Web, se utilizó buenas prácticas, metodologías First mobile,\n" +
                                     " metodología BEM, Responsive con media Queries responsive se utilizó Html y Css.",
                    "https://rodolfoparada.github.io/batatabit/"

            );
            Proyectos proyecto2 = new Proyectos(
                    2,
                    "Proyecto GAMEZONE",
                    "Descripción: Es un Ecommerce, se utilizó buenas prácticas, metodologías First mobile,\n" +
                            " metodología BEM, Responsive con media Queries se utilizó Html y Css.",
                    "https://rodolfoparada.github.io/E-COMMERCE/"

            );

            Proyectos proyecto3 = new Proyectos(
                    3,
                    "Proyecto Barbería",
                    "Descripción: Es una pagina de una Barbería,su utilizó buenas prácticas,\n" +
                            " metodologías First mobile, metodología BEM, Responsive con media Queries se utilizó Html y Css.",
                            "https://rodolfoparada.github.io/cursohtmlAlura/"

            );
            Proyectos proyecto4 = new Proyectos(
                    4,
                    "Proyecto Fuente de Soda",
                    "Descripción: Es una pagina de una Fuente de Soda,su utilizó buenas prácticas,\n" +
                            " metodologías First mobile, metodología BEM, Responsive con media Queries se utilizó Html y Css.",
                    "https://rodolfoparada.github.io/FuenteSoda1/index.html"
            );
            Proyectos proyecto5 = new Proyectos(
                    5,
                    "Proyecto Auto-Limpio",
                    "Descripción: Es una pagina de Limpieza de Autos,su utilizó buenas prácticas,\n" +
                            " metodologías First mobile, metodología BEM, Responsive con media Queries se utilizó Html y Css.",
                    "https://rodolfoparada.github.io/AutoLimpio/"



            );
            Proyectos proyecto6 = new Proyectos(
                    6,
                   "Proyecto Encriptar-Desencriptar",
                    "Descripción: Es un encriptador y desencriptador de mensajes, se utilizó\n" +
                            " metodologías First mobile Bem lenguajes de Javascript con Html y Css.",
                   "https://rodolfoparada.github.io/ChallengerOneDesafio1/"

            );
            Proyectos proyecto7 = new Proyectos(
                    7,
                    "Web Anime",
                    "Descripción: Es una página web que se utilizó ccs y html usando buenas practicas.",
                    "https://rodolfoparada.github.io/AnimeWeb/"

            );
            Proyectos proyecto8 = new Proyectos(
                    8,
                    "Web Hotel",
                    "Descripción: Es una página web que se utilizó ccs y html usando buenas practicas.",
                    "https://rodolfoparada.github.io/WebHotel/"

            );
            Proyectos proyecto9 = new Proyectos(
                    9,
                    "Juego Bomba",
                    "Descripción: Es un juego realizado con javascrip tiene varios niveles.",
                    "https://rodolfoparada.github.io/Juego-Bomba-Javascript/"
            );
            Proyectos proyecto10 = new Proyectos(
                    10,
                   "PokeApi",
                    "Descripción: Búsqueda de pokemon utilizando vue.js desplegando en netlify ",
                    "https://rodolfo-parada-poke-vue-router3.netlify.app/pokemons/charmander"

            );
            Proyectos proyecto11 = new Proyectos(
                    11,
                    "Es una blog de post",
                    "Descripción: Se utilizó vue.js",
                    "https://blogs-rodolfo-parada.netlify.app/"
                    );
            Proyectos proyecto12 = new Proyectos(
                    12,
                    "Animación",
                    "Descripción: animacion con html y css",
                    "https://rodolfoparada.github.io/animacion/"
                    );
            Proyectos proyecto13 = new Proyectos(
                    13,
                    "Lanfing Page",
                    "Descripción: Landing Page realizada con html y css",
                    "https://rodolfoparada.github.io/landingPAGE/"
            );
            Proyectos proyecto14 = new Proyectos(
                    14,
                    "En Desarrollo",
                    "Descripción: En Desarrollo",
                    "vacio"
            );
            Proyectos proyecto15 = new Proyectos(
                    15,
                    "En Desarrollo",
                    "Descripción: En Desarrollo",
                    "vacio"
            );
            Proyectos proyecto16 = new Proyectos(
                    16,
                    "En Desarrollo",
                    "Descripción: En Desarrollo",
                    "vacio"
            );
            Proyectos proyecto17 = new Proyectos(
                    17,
                    "En Desarrollo",
                    "Descripción: En Desarrollo",
                    "vacio"
            );
            Proyectos proyecto18 = new Proyectos(
                    18,
                    "En Desarrollo",
                    "Descripción: En Desarrollo",
                    "vacio"
            );
            Proyectos proyecto19 = new Proyectos(
                    19,
                    "En Desarrollo",
                    "Descripción: En Desarrollo",
                    "vacio"
            );
            Proyectos proyecto20 = new Proyectos(
                    20,
                    "En Desarrollo",
                    "Descripción: En Desarrollo",
                    "vacio"
            );
            Proyectos proyecto21 = new Proyectos(
                    21,
                    "En Desarrollo",
                    "Descripción: En Desarrollo",
                    "vacio"
            );
            Proyectos proyecto22 = new Proyectos(
                    22,
                    "En Desarrollo",
                    "Descripción: En Desarrollo",
                    "vacio"
            );
            Proyectos proyecto23 = new Proyectos(
                    23,
                    "En Desarrollo",
                    "Descripción: En Desarrollo",
                    "vacio"
            );
            Proyectos proyecto24 = new Proyectos(
                    24,
                    "En Desarrollo",
                    "Descripción: En Desarrollo",
                    "vacio"
            );
            // Crear una lista de experiencias
            List<Proyectos> proyectos = Arrays.asList(proyecto1, proyecto2, proyecto3, proyecto4, proyecto5, proyecto6, proyecto7, proyecto8, proyecto9,proyecto10, proyecto11,proyecto12);

            // Convertir la lista a JSON
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(proyectos); // Devuelve el JSON como String

        } catch (Exception e) {
            e.printStackTrace();
            return "[]"; // Devuelve un arreglo vacío en caso de error
        }

    }


}//fin del metodo

