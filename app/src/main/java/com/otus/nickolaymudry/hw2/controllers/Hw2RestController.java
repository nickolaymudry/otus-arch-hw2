package com.otus.nickolaymudry.hw2.controllers;

import com.otus.nickolaymudry.hw2.dto.ResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hw2RestController {

    @GetMapping("health")
    public ResponseDto health() {
        return ResponseDto.of("OK");
    }

}
