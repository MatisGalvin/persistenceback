package fr.persistence.demo.Repository;

import fr.persistence.demo.Entity.Categorie;
import fr.persistence.demo.Entity.Emprunt;
import fr.persistence.demo.Entity.Livre;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmpruntRepository extends CrudRepository<Emprunt, Long> {
//    @Query("SELECT COUNT(*) FROM emprunt_livre RIGHT JOIN livre ON emprunt_livre.livre_id = livre.id  WHERE livre_id = ?1")
//    Integer getNumberEmpruntByLivreId(Long ID);
}
