package fr.persistence.demo.Repository;

import fr.persistence.demo.Entity.Livre;
import org.springframework.data.repository.CrudRepository;

public interface LivreRepository extends CrudRepository<Livre, Long> {
}
