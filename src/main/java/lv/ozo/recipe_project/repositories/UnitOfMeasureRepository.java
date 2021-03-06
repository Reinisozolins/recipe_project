package lv.ozo.recipe_project.repositories;

import lv.ozo.recipe_project.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository <UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
