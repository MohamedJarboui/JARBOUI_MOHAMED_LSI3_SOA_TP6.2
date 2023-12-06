package web;


import com.example.tp6.etienties.Compte;
import com.example.tp6.repositories.CompteRepository;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Path("/banque")
public class CompteRestJaxRSAPI {
    @Autowired
    private CompteRepository compteRepository;

    // Récupérer la liste de tous les comptes
    @Path("/comptes")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Compte> compteList() {
        return compteRepository.findAll();
    }

    // Récupérer un compte spécifique par son ID
    @Path("/comptes/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Compte getOne(@PathParam(value = "id") Long id) {
        return compteRepository.findById(id).get();
    }

    // Enregistrer un nouveau compte
    @Path("/comptes")
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public Compte save(Compte compte) {
        return compteRepository.save(compte);
    }

    // Mettre à jour un compte existant
    @Path("/comptes/{id}")
    @PUT
    @Produces({MediaType.APPLICATION_JSON})
    public Compte update(Compte compte, @PathParam("id") Long id) {
        compte.setId(id);
        return compteRepository.save(compte);
    }

    // Supprimer un compte par son ID
    @Path("/comptes/{id}")
    @DELETE
    @Produces({MediaType.APPLICATION_JSON})
    public void delete(@PathParam("id") Long id) {
        compteRepository.deleteById(id);
    }
}

