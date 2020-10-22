package lv.ozo.recipe_project.repositories;

import lv.ozo.recipe_project.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
