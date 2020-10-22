package lv.ozo.recipe_project.controllers;

import lv.ozo.recipe_project.domain.Category;
import lv.ozo.recipe_project.domain.UnitOfMeasure;
import lv.ozo.recipe_project.repositories.CategoryRepository;
import lv.ozo.recipe_project.repositories.UnitOfMeasureRepository;
import lv.ozo.recipe_project.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }

    //    private CategoryRepository categoryRepository;
//    private UnitOfMeasureRepository unitOfMeasureRepository;
//
//    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
//        this.categoryRepository = categoryRepository;
//        this.unitOfMeasureRepository = unitOfMeasureRepository;
//    }

//    @RequestMapping({"/index"})
//    public String getIndexPage(){
//
//        Optional<Category> categoryOptional= categoryRepository.findByDescription("American");
//        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
//
//        System.out.println("Cat ID is " + categoryOptional.get().getId());
//        System.out.println("UDM ID is "+ unitOfMeasureOptional.get().getId());
//
//        return"index";
//    }
}
