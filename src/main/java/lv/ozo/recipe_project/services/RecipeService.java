package lv.ozo.recipe_project.services;


import lv.ozo.recipe_project.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe>getRecipes();
}
