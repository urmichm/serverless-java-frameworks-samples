package software.amazonaws.example.product.product.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.amazonaws.serverless.exceptions.ContainerInitializationException;
import com.amazonaws.serverless.proxy.model.AwsProxyRequest;
import com.amazonaws.serverless.proxy.model.AwsProxyResponse;
import com.amazonaws.serverless.proxy.spring.SpringBootLambdaContainerHandler;

import software.amazonaws.example.product.product.SpringBootSampleApplication;



public class MvcProductFunction implements RequestStreamHandler {
  public static SpringBootLambdaContainerHandler<AwsProxyRequest, AwsProxyResponse> handler;
  static {
    try {
      System.out.println("MvcProductFunction: static block");
      handler = SpringBootLambdaContainerHandler.getAwsProxyHandler(SpringBootSampleApplication.class);
    } catch (ContainerInitializationException e) {
      // if we fail here. We re-throw the exception to force another cold start
      e.printStackTrace();
      throw new RuntimeException("Could not initialize Spring Boot application", e);
    }
  }

  @Override
  public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context)
    throws IOException {
    System.out.println("MvcProductFunction: handleRequest() block");

    handler.proxyStream(inputStream, outputStream, context);
  }
}