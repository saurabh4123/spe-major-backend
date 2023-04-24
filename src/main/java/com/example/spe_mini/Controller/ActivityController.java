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

    @PostMapping("/add-activity1/{eid}")
    public ResponseEntity<?> addActivity(@RequestBody Activity1 activity1,@PathVariable("eid") Integer id)
    {
            Employee emp=this.activity1Services.addActivity(activity1,id);
            return new ResponseEntity<>(emp, HttpStatus.CREATED);
    }
    @PostMapping("/add-activity2/{eid}")
    public ResponseEntity<?> addActivity(@RequestBody Activity2 activity2,@PathVariable("eid") Integer id)
    {
        Employee emp=this.activity2Services.addActivity(activity2,id);
        return new ResponseEntity<>(emp, HttpStatus.CREATED);
    }
    @PostMapping("/add-activity3/{eid}")
    public ResponseEntity<?> addActivity(@RequestBody Activity3 activity3,@PathVariable("eid") Integer id)
    {
        Employee emp=this.activity3Services.addActivity(activity3,id);
        return new ResponseEntity<>(emp, HttpStatus.CREATED);
    }
    @PostMapping("/add-activity4/{eid}")
    public ResponseEntity<?> addActivity(@RequestBody Activity4 activity4,@PathVariable("eid") Integer id)
    {
        Employee emp=this.activity4Services.addActivity(activity4,id);
        return new ResponseEntity<>(emp, HttpStatus.CREATED);
    }
    @PostMapping("/add-activity5/{eid}")
    public ResponseEntity<?> addActivity(@RequestBody Activity5 activity5,@PathVariable("eid") Integer id)
    {
        Employee emp=this.activity5Services.addActivity(activity5,id);
        return new ResponseEntity<>(emp, HttpStatus.CREATED);
    }
}
