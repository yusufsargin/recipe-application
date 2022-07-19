package com.yusufsargin.RecipeApp.controller;

import com.yusufsargin.RecipeApp.domain.Category;
import com.yusufsargin.RecipeApp.repositories.CategoryRepository;
import com.yusufsargin.RecipeApp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        Optional<Category> category = categoryRepository.findByDescription("American");

        System.out.println("Category Id: " +category.get().getId());


        return "index";
    }
}
