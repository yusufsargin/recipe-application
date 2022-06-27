package com.yusufsargin.RecipeApp.repositories;

import com.yusufsargin.RecipeApp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
