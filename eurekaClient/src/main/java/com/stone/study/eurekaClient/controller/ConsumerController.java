package com.stone.study.eurekaClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.stone.study.eurekaClient.service.stock.StockServiceClient;

@RestController
@RequestMapping(value = "/consume")
public class ConsumerController {

  @Autowired
  private StockServiceClient stockServiceClient;

  @RequestMapping(value = "/increase", method = RequestMethod.GET)
  public String increase() {
    System.out.println("IN");
    return stockServiceClient.increase(1);
  }
}
