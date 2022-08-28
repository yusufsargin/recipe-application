package com.yusufsargin.RecipeApp.repositories;

import com.yusufsargin.RecipeApp.domain.UnitOfMeasure;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryTestIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Test
    public void findByDescription() throws Exception {
        Optional<UnitOfMeasure> unitOfMeasure =
                unitOfMeasureRepository.findByDescription("Teaspoon");

        Assert.assertEquals("Teaspoon", unitOfMeasure.get().getDescription());
    }
}