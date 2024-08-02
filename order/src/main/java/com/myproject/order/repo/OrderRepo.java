package com.myproject.order.repo;

import org.springframework.stereotype.Repository;
import com.myproject.order.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface OrderRepo extends MongoRepository<Order, Integer> {
}
