package com.programming.swiggyapp.client;

import com.programming.swiggyapp.dto.OrderResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestaurantServiceClient {

    // this is used for rest communication between microservices
    @Autowired
    private RestTemplate template;

    public OrderResponseDTO fetchOrderStatus(String orderId) {
        return template.getForObject("http://RESTAURANT-SERVICE/restaurant/orders/status/"+ orderId, OrderResponseDTO.class);
    }
}
