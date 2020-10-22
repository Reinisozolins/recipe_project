package lv.ozo.recipe_project.repositories;

import lv.ozo.recipe_project.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository <Category, Long> {


    Optional<Category> findByDescription(String description);
}
