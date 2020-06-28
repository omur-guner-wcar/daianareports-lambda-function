package com.wirelesscar.daiana.function;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.ScheduledEvent;
public class DaianaReportsLambda implements RequestHandler<ScheduledEvent, String> {

  @Override
  public String handleRequest(ScheduledEvent input, Context context) {

    return "Hello from Lambda!";

  }




}