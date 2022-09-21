package com.increff.ta.channel.controller;


import com.increff.ta.channel.dto.ToyAssureDto;
import com.increff.ta.commons.ApiResponse;
import com.increff.ta.commons.model.OrderForm;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
@RequestMapping("/api/toy-assure")
public class ToyAssureController {

  @Autowired
  ToyAssureDto toyAssureDto;

  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public ApiResponse createOrder(@RequestBody OrderForm orderForm){
    return toyAssureDto.createOrder(orderForm);
  }
}