package com.microservices.limitsservice.controller;

import com.microservices.limitsservice.bean.Limits;
import com.microservices.limitsservice.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

  private Configuration configuration;

  @Autowired
  public LimitsController(Configuration configuration) {
    this.configuration = configuration;
  }

  @GetMapping("/limits")
  public Limits retrieveLimits() {

    return new Limits(configuration.getMinimum(), configuration.getMaximum());
  }


}
