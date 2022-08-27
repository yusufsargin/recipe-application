package com.yusufsargin.RecipeApp.services;

import com.yusufsargin.RecipeApp.domain.Recipe;
import com.yusufsargin.RecipeApp.repositories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class RecipeServiceImplTest {
    RecipeService recipeService;

    @Mock
    RecipeRepository recipeRepository;

    Set<Recipe> dummyRecipes;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        recipeService = new RecipeServiceImpl(this.recipeRepository);
        dummyRecipes = new HashSet<>();

        dummyRecipes.add(new Recipe());
    }

    @Test
    public void getRecipes() throws Exception {
        when(recipeService.getRecipes()).thenReturn(this.dummyRecipes);

        Set<Recipe> recipes = recipeService.getRecipes();

        assertEquals(recipes.size(), 1);
        verify(recipeRepository, times(1)).findAll();
    }
}