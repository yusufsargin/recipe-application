package com.yusufsargin.RecipeApp.services;

import com.yusufsargin.RecipeApp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long id);
}
