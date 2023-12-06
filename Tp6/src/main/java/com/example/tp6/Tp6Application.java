package com.example.tp6;

import com.example.tp6.etienties.Compte;
import com.example.tp6.etienties.EtatCompte;
import com.example.tp6.etienties.TypeCompte;
import com.example.tp6.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Date;
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.tp6.repositories")
@EntityScan("com.example.tp6.etienties")
@ComponentScan("com.example")
public class Tp6Application {

    public static void main(String[] args) {
        SpringApplication.run(Tp6Application.class, args);
    }

    @Bean
    CommandLineRunner start(CompteRepository compte) {
        return args -> {
            compte.save(new Compte(null, 600.0, new Date(), TypeCompte.EPARGNE, EtatCompte.ACTIVE));
            compte.save(new Compte(null, 500, new Date(), TypeCompte.COURANT, EtatCompte.SUSPENDU));
            compte.save(new Compte(null, 2503, new Date(), TypeCompte.COURANT, EtatCompte.BLOQUE));
            compte.findAll().forEach(c -> {
                System.out.println(c);
            });


        };
    }
}
