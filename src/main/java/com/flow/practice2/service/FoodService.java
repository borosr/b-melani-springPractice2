package com.flow.practice2.service;

import com.flow.practice2.entity.Food;
import com.flow.practice2.exception.ValidationException;
import com.flow.practice2.repository.FoodRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {

    @Autowired
    private final FoodRepository foodRepository;

    private static final Logger log = LoggerFactory.getLogger(FoodService.class);

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public Food createFood(Food fromRequest) throws ValidationException {
        if (fromRequest.getName() == null || fromRequest.getName() == "") {
            throw new ValidationException();
        } else {
            log.info("Creating food based on: {} ...", fromRequest);
            Food result = foodRepository.save(fromRequest);
            return result;
        }
    }
}
