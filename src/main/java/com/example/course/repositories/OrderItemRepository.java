package com.example.course.repositories;
import com.example.course.entities.User;
import com.example.course.entities.entities.pk.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
