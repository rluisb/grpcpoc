package com.github.rluisb.grpc.server;

import com.github.rluisb.grpc.server.service.GreetService;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class GrpcServerApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(GrpcServerApplication.class, args);
        ServerBuilder.forPort(8080)
                .addService(new GreetService())
                .build().start().awaitTermination();
    }


}
