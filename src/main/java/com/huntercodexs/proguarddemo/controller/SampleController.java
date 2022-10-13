package com.huntercodexs.proguarddemo.controller;

import com.huntercodexs.proguarddemo.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("${api.prefix}")
public class SampleController {

    @Autowired
    SampleService sampleService;

    @GetMapping(path = "/welcome")
    @ResponseBody
    public ResponseEntity<String> welcome() {
        return sampleService.welcome();
    }

}
