// Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
// SPDX-License-Identifier: MIT-0

package software.amazonaws.example.product.product;

//import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
//import com.amazonaws.xray.entities.TraceHeader;
//import com.amazonaws.xray.entities.TraceID;
//import com.amazonaws.xray.interceptors.TracingInterceptor;
//import org.joda.time.DateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.nativex.hint.TypeHint;
//
//import java.util.HashSet;

//@TypeHint(types = {
//  DateTime.class,
//  APIGatewayProxyRequestEvent.class,
//  TracingInterceptor.class,
//  HashSet.class,
//  TraceHeader.class,
//  TraceID.class
//},
//  typeNames = {
//    "com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent$ProxyRequestContext",
//    "com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent$RequestIdentity",
//    "com.amazonaws.xray.entities.TraceHeader$SampleDecision"
//  })
@SpringBootApplication
public class SpringBootSampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootSampleApplication.class, args);
  }
}
