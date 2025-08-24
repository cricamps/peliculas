package com.example.peliculas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PeliculasApplication {

    public static void main(String[] args) {
        SpringApplication.run(PeliculasApplication.class, args);
        
        System.out.println("\n" + "=".repeat(70));
        System.out.println("🎬 MICROSERVICIO DE PELÍCULAS INICIADO EXITOSAMENTE 🎬");
        System.out.println("=".repeat(70));
        System.out.println("📡 Servidor corriendo en: http://localhost:8080");
        System.out.println("\n📋 Endpoints disponibles:");
        System.out.println("   • GET /peliculas       - Obtener todas las películas");
        System.out.println("   • GET /peliculas/{id}  - Obtener película por ID específico");
        System.out.println("\n🎯 Ejemplos de uso:");
        System.out.println("   • http://localhost:8080/peliculas");
        System.out.println("   • http://localhost:8080/peliculas/1");
        System.out.println("   • http://localhost:8080/peliculas/3");
        System.out.println("\n📚 Películas disponibles: 6 películas en memoria");
        System.out.println("=".repeat(70) + "\n");
    }
}