package com.example.eat_it.common.dto;

import lombok.Data;

@Data
public class DeliveryDTO {
    private Long orderId;
    private Long deliveryPersonId;
    private String status; // ASSIGNED, PICKED, DELIVERED
}