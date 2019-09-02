package com.example.library.repository;

import com.example.library.DAO.Order;
import com.example.library.DAO.Reader;
import org.springframework.stereotype.Component;


import java.util.Arrays;
import java.util.List;

@Component
public class OrderRepositoryImpl implements OrderRepository {
    @Override
    public Order getOrdersByReaderId(List<Order> orderList, Reader id) {
        return null;
    }

    @Override
    public boolean deleteOrderByOrderId(List<Order> orderList, Reader id) {
        if (id != null && orderList.contains(id)) {
            orderList.remove(id);
            return true;
        }
        return false;
    }
}
