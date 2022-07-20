package com.yusufsargin.RecipeApp.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.yusufsargin.RecipeApp.domain.Recipe;
import com.yusufsargin.RecipeApp.repositories.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipes = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
        return recipes;
    }

}
