//package com.flow.practice2.repository;
//
//import com.flow.practice2.entity.Order;
//import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public interface OrderRepository extends PagingAndSortingRepository<Order, String> {
//
//    @Override
//    <S extends Order> S save(S s);
//
//    @Override
//    List<Order> findAll();
//
//    @Override
//    Optional<Order> findById(String s);
//}
