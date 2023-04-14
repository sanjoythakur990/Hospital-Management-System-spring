package com.example.Hospital.Management.System;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping("/doctor")
public class DoctorController {
    HashMap<Integer,Doctor> doctorDb=new HashMap<>();
    @PostMapping("/add")
    public String addDoctor(@RequestBody Doctor doctor){
        int doctorId=doctor.getDoctorId();
        doctorDb.put(doctorId,doctor);
        return "doctor added successfully";
    }
}
