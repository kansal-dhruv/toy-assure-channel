package com.increff.ta.channel.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.increff.ta.commons.ApiResponse;
import com.increff.ta.commons.model.OrderForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class ToyAssureApi {

  private final RestTemplate restTemplate;

  private final String toyAssureUrl = "http://localhost:9000/toyassure/api/order/channel";

  @Autowired
  public ToyAssureApi(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  public ApiResponse createOrder(OrderForm orderForm){
    try {
      restTemplate.postForEntity(toyAssureUrl, orderForm, String.class);
      ApiResponse apiResponse = new ApiResponse();
      apiResponse.setCode(1);
      apiResponse.setMessage("Success");
      return apiResponse;
    } catch (HttpClientErrorException e){
      ObjectMapper objectMapper = new ObjectMapper();
      return objectMapper.convertValue(e.getResponseBodyAsString(), ApiResponse.class);
    }
  }

}