package com.example.Hospital.Management.System;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nurse")
public class NurseController {
    NurseService nurseService=new NurseService();
    @PostMapping("/add")
    public String addNurse(@RequestBody Nurse nurse){
        String ans=nurseService.addNurse(nurse);
        return ans;
    }

    @GetMapping("/getByAge")
    public List<Nurse> getNursesGreaterThanAge(@RequestParam("age")Integer age){
        List<Nurse> nurseList=nurseService.getList(age);
        return nurseList;
    }
    @GetMapping("/getByQualificaton")
    public List<Nurse> getNursesByQualification(@RequestParam("qualification")String qualification){
        List<Nurse> nurses=nurseService.getNursesByQualification(qualification);
        return nurses;
    }
}
