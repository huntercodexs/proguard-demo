package com.huntercodexs.proguarddemo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok().body("Welcome is running on SampleController - Proguard Demo");
    }
}
