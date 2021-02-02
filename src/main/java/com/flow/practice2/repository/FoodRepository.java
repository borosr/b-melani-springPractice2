package com.flow.practice2.repository;

import com.flow.practice2.entity.Food;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FoodRepository extends PagingAndSortingRepository<Food, String> {

    @Override
    <S extends Food> S save(S s);

    @Override
    List<Food> findAll();

    @Override
    Optional<Food> findById(String s);
}
