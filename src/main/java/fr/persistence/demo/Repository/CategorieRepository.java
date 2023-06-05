package fr.persistence.demo.Repository;

import fr.persistence.demo.Entity.Categorie;
import org.springframework.data.repository.CrudRepository;

public interface CategorieRepository extends CrudRepository<Categorie, Long> {
}
