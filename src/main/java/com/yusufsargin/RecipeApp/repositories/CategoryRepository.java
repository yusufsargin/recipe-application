package com.yusufsargin.RecipeApp.repositories;

import com.yusufsargin.RecipeApp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
