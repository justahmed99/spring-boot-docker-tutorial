package com.example.springdockerdemo.controller;

import com.example.springdockerdemo.model.response.DataResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class ExampleController {
    @GetMapping("")
    public ResponseEntity<DataResponse> getHelloWorld() {
        DataResponse data = new DataResponse("Hello World!");

        return ResponseEntity.ok(data);
    }
}
