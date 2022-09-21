package com.increff.ta.channel.dto;

import com.increff.ta.channel.api.ToyAssureApi;
import com.increff.ta.commons.ApiResponse;
import com.increff.ta.commons.model.OrderForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ToyAssureDto {

  @Autowired
  ToyAssureApi toyAssureApi;

  public ApiResponse createOrder(OrderForm orderForm){
    return toyAssureApi.createOrder(orderForm);
  }

}