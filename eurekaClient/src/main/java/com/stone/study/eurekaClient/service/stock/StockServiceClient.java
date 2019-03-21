package com.stone.study.eurekaClient.service.stock;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "stockService")
public interface StockServiceClient {

  @RequestMapping(method = RequestMethod.POST, value = "/stock/increase", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public String increase(@RequestBody Integer number);

  
}
