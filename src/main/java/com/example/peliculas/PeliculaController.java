package com.example.peliculas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;


@RestController
public class PeliculaController {
    
    // Lista de películas en memoria
    private List<Pelicula> peliculas = new ArrayList<>();
    
    // Constructor que inicializa las películas
    public PeliculaController() {
        inicializarPeliculas();
    }
    
    /**
     * Método para agregar las películas en memoria
     */
    private void inicializarPeliculas() {
        peliculas.add(new Pelicula(1, 
            "El Padrino", 
            1972, 
            "Francis Ford Coppola", 
            "Drama/Crimen", 
            "La saga de la familia Corleone bajo la dirección del patriarca Vito Corleone, desde su ascensión hasta la transición del poder a su hijo Michael."));
            
        peliculas.add(new Pelicula(2, 
            "Pulp Fiction", 
            1994, 
            "Quentin Tarantino", 
            "Drama/Crimen", 
            "La vida de dos asesinos de la mafia, un boxeador, la esposa de un gángster y dos bandidos tienen relatos de violencia y redención."));
            
        peliculas.add(new Pelicula(3, 
            "El Señor de los Anillos: La Comunidad del Anillo", 
            2001, 
            "Peter Jackson", 
            "Fantasía/Aventura", 
            "Un hobbit debe emprender un peligroso viaje para destruir un anillo mágico y salvar la Tierra Media del malvado Sauron."));
            
        peliculas.add(new Pelicula(4, 
            "Matrix", 
            1999, 
            "Lana y Lilly Wachowski", 
            "Ciencia Ficción/Acción", 
            "Un programador descubre que la realidad tal como la conoce no existe y debe unirse a una rebelión contra las máquinas que controlan el mundo."));
            
        peliculas.add(new Pelicula(5, 
            "Inception", 
            2010, 
            "Christopher Nolan", 
            "Ciencia Ficción/Thriller", 
            "Un ladrón que roba secretos del subconsciente debe realizar la tarea imposible de implantar una idea en lugar de robarla."));
            
        peliculas.add(new Pelicula(6, 
            "Forrest Gump", 
            1994, 
            "Robert Zemeckis", 
            "Drama/Romance", 
            "Las aventuras de un hombre especial que participa en eventos históricos importantes del siglo XX."));
    }
    
    /**
     * GET /peliculas - Obtiene todas las películas
     * @return Lista completa de películas
     */
    @GetMapping("/peliculas")
    public List<Pelicula> obtenerTodasLasPeliculas() {
        return peliculas;
    }
    
    /**
     * GET /peliculas/{id} - Obtiene una película específica por su ID
     * @param id Identificador de la película
     * @return Película encontrada o null si no existe
     */
    @GetMapping("/peliculas/{id}")
    public Pelicula obtenerPeliculaPorId(@PathVariable int id) {
        // Buscar la película con el ID
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getId() == id) {
                return pelicula;
            }
        }
        
        // Si no se encuentra la película devuelve null
        return null;
    }
}