package com.yusufsargin.RecipeApp.repositories;

import com.yusufsargin.RecipeApp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,Long> {

    Optional<Category> findByDescription(String description);
}
