package com.example.spe_mini.Services;

import com.example.spe_mini.Models.Activity1;
import com.example.spe_mini.Models.Employee;

import java.util.List;

public interface Activity1Services {
    Activity1 addActivity(Activity1 activity1);

    List<Activity1> findActivityByEmployee(Employee emp);
}
