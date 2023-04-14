package com.example.Hospital.Management.System;
import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class NurseService {
    NurseRepository nurseRepository=new NurseRepository();
    public String addNurse(Nurse nurse){
        // we should write some logic
        // validations
        if(nurse.getNurseId()<0)
            return "Enter a valid nurseId";
        if(nurse.getName().equals(""))
            return "The name should not be null";
        String ans=nurseRepository.addNurse(nurse);
        return ans;
    }
    public List<Nurse> getList(int age){
        // calling all the nurses from database
        List<Nurse> nurses=nurseRepository.getAllNurses();
        // Now write the logic to extract what is required
        List<Nurse> finalList=new ArrayList<>();
        for(Nurse n:nurses)
            if(n.getAge()>age) finalList.add(n);
        return finalList;
    }
    public List<Nurse> getNursesByQualification(String qualification){
        // calling all the nurses from database
        List<Nurse> nurses=nurseRepository.getAllNurses();
        // implementing logic to filter out what is needed
        List<Nurse> finalList=new ArrayList<>();
        for(Nurse n:nurses)
            if(n.getQualification().equals(qualification)) finalList.add(n);
        return finalList;
    }
}
