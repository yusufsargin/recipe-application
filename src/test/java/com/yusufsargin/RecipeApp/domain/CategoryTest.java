package com.yusufsargin.RecipeApp.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CategoryTest {

    Category category;

    @Before
    public void setup() {
        category = new Category();
    }

    @Test
    public void getId() throws Exception {
        Long idValue = 4L;

        category.setId(idValue);

        assertEquals("Id values should be equal", idValue, category.getId());
    }

    @Test
    public void getDescription() throws Exception {
        String description = "Test description";

        category.setDescription(description);

        assertEquals("Descriptions should be equal", description, category.getDescription());
    }

    @Test
    public void getRecipes() throws Exception {
        Set<Recipe> recipes = new HashSet<>();

        recipes.add(new Recipe());

        category.setRecipes(recipes);

        assertNotNull("Recipes shouldn't be null", category.getRecipes());
    }
}