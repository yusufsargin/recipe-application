package com.yusufsargin.RecipeApp.controller;

import com.yusufsargin.RecipeApp.domain.Recipe;
import com.yusufsargin.RecipeApp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/recipe")
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping(value = "/show/{id}")
    public String getShowRecipePage(Model model,
                                    @PathVariable(value = "id") String id) {

        Recipe recipe = recipeService.findById(Long.valueOf(id));
        model.addAttribute("recipe", recipe);

        return "recipe/show";
    }
}
