package com.example.spe_mini.Controller;

import com.example.spe_mini.Models.*;
import com.example.spe_mini.Services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/activity")
public class ActivityController {
    @Autowired
    private Activity1Services activity1Services;
    @Autowired
    private Activity2Services activity2Services;
    @Autowired
    private Activity3Services activity3Services;
    @Autowired
    private Activity4Services activity4Services;
    @Autowired
    private Activity5Services activity5Services;

    @PostMapping("/add-activity1")
    public ResponseEntity<?> addActivity(@RequestBody Activity1 activity1)
    {
            Activity1 activity11=this.activity1Services.addActivity(activity1);
            return new ResponseEntity<>(activity11, HttpStatus.CREATED);
    }
    @PostMapping("/add-activity2")
    public ResponseEntity<?> addActivity(@RequestBody Activity2 activity2)
    {
        Activity2 activity21=this.activity2Services.addActivity(activity2);
        return new ResponseEntity<>(activity21, HttpStatus.CREATED);
    }
    @PostMapping("/add-activity3")
    public ResponseEntity<?> addActivity(@RequestBody Activity3 activity3)
    {
        Activity3 activity31=this.activity3Services.addActivity(activity3);
        return new ResponseEntity<>(activity31, HttpStatus.CREATED);
    }
    @PostMapping("/add-activity4")
    public ResponseEntity<?> addActivity(@RequestBody Activity4 activity4)
    {
        Activity4 activity41=this.activity4Services.addActivity(activity4);
        return new ResponseEntity<>(activity41, HttpStatus.CREATED);
    }
    @PostMapping("/add-activity5")
    public ResponseEntity<?> addActivity(@RequestBody Activity5 activity5)
    {
        Activity5 activity51=this.activity5Services.addActivity(activity5);
        return new ResponseEntity<>(activity51, HttpStatus.CREATED);
    }
}
