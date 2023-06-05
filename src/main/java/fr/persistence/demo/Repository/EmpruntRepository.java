package fr.persistence.demo.Repository;

import fr.persistence.demo.Entity.Emprunt;
import org.springframework.data.repository.CrudRepository;

public interface EmpruntRepository extends CrudRepository<Emprunt, Long> {
}
