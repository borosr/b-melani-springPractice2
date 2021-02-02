package com.flow.practice2.controller;

import com.flow.practice2.entity.Food;
import com.flow.practice2.exception.ValidationException;
import com.flow.practice2.service.FoodService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/foods")
public class FoodController {

    private static final Logger log = LoggerFactory.getLogger(FoodController.class);

    private final FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @PostMapping("/add")
    public Food addFood(@RequestBody Food food) {
        log.info("Received addFood request {} ...", food);
        try {
            Food result = foodService.createFood(food);
            log.debug("Result is: {}.", result);
            return result;
        } catch (ValidationException e) {
            e.printStackTrace();
            log.error("Error when creating food");
            return null;
        }
    }

}
