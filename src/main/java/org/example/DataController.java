package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
    @GetMapping("/data")
    public Data getData() {
        Data data = new Data();
        data.setMessage("Hello, world!");
        data.setTimestamp(System.currentTimeMillis());
        return data;
    }
}