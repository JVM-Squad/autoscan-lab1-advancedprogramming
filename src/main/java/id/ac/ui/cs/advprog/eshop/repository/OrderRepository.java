package id.ac.ui.cs.advprog.eshop.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import id.ac.ui.cs.advprog.eshop.model.Order;

@Repository
public class OrderRepository {
    private List<Order> orderData = new ArrayList<>();

    public Order save(Order order){return null;}

    public Order findById(String id){return null;}

    public List<Order> findAllByAuthor(String author){return null;}
    
}
