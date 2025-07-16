package com.microservices.order.service;

import com.microservices.order.dto.OrderRequest;
import com.microservices.order.model.Order;
import com.microservices.order.repository.OrderRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepo orderRepository;

    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();

        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setSkuCode(orderRequest.skuCode());
        order.setQuantity(orderRequest.quantity());

        orderRepository.save(order);
    }
}
