package com.amzur.user_management.dto.response;

import lombok.Data;

@Data
public class OrderResponse {
  
    private Long orderId;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}  
    
    
}

