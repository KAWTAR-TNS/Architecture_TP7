package ma.ws.jaxrs.config;

import jakarta.ws.rs.*;
import ma.ws.jaxrs.entities.Compte;
import ma.ws.jaxrs.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.ws.rs.core.MediaType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Path("/banque")
public  class CompteRestJaxRSAPI {

    @Autowired
    private CompteRepository compteRepository;

    // READ: Récupérer tous les comptes
    @Path("/comptes")
    @GET
    @Produces({"application/json"})
    public List<Compte> getComptes() {
        return compteRepository.findAll();
    }

    // READ: Récupérer un compte par son identifiant
    @Path("/comptes/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Compte getCompte(@PathParam("id") Long id) {
        return compteRepository.findById(id).orElse(null);
    }

    // CREATE: Ajouter un nouveau compte
    @Path("/comptes")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Compte addCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    // UPDATE: Mettre à jour un compte existant
    @Path("/comptes/{id}")
    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Compte updateCompte(@PathParam("id") Long id, Compte compte) {
        Compte existingCompte = compteRepository.findById(id).orElse(null);
        if (existingCompte != null) {
            existingCompte.setSolde(compte.getSolde());
            existingCompte.setDateCreation(compte.getDateCreation());
            existingCompte.setType(compte.getType());
            return compteRepository.save(existingCompte);
        }
        return null;
    }

    // DELETE: Supprimer un compte
    @Path("/comptes/{id}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteCompte(@PathParam("id") Long id) {
        compteRepository.deleteById(id);
    }
}