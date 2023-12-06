package com.example.tp6;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import web.CompteRestJaxRSAPI;

@Configuration
public class MyConfig {
    // Cette méthode crée et configure un objet ResourceConfig pour Jersey.
    // Elle enregistre la classe CompteRestJaxRSAPI en tant que ressource.
    @Bean
    public ResourceConfig resourceConfig() {
        // Créer une instance de ResourceConfig (configuration de Jersey)
        ResourceConfig jerseyServlet = new ResourceConfig();

        // Enregistrer la classe CompteRestJaxRSAPI en tant que ressource
        jerseyServlet.register(CompteRestJaxRSAPI.class);

        // Renvoyer la configuration de Jersey pour être utilisée par le conteneur Spring
        return jerseyServlet;
    }
}
