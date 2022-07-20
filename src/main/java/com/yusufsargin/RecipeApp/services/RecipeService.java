package com.yusufsargin.RecipeApp.services;

import java.util.Set;

import com.yusufsargin.RecipeApp.domain.Recipe;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
