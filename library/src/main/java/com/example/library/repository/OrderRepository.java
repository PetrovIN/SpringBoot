package com.example.library.repository;

import com.example.library.DAO.Order;
import org.springframework.stereotype.Component;

import java.io.Reader;
import java.util.List;

@Component
public interface OrderRepository {
    Order getOrdersByReaderId(List<Order> orderList, Reader id);
    boolean deleteOrderByOrderId(List<Order> orderList, Reader id);
}
