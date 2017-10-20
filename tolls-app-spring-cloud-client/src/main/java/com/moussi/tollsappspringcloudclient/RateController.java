package com.moussi.tollsappspringcloudclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by moussi on 20/10/17.
 */
@RestController
public class RateController {

  @Value("${rate}")
  private String rate;
  @Value("${lanecount}")
  private String laneCount;
  @Value("${tollstart}")
  private String tollstart;

  @RequestMapping("/rate")
  public String getRate(){
    return rate + " " + laneCount + " " + tollstart;
  }
}
