package com.example.library.DAO;

import java.util.List;
import com.example.library.DAO.Order;
import org.springframework.stereotype.Component;

@Component
public class Reader {
    private int id;
    private String name;
    private List<Order> orderList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
