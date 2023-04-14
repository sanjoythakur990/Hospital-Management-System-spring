package com.example.Hospital.Management.System;
import java.util.*;
import org.springframework.stereotype.Repository;

@Repository
public class NurseRepository {
    // This class will contain database(hashmap/mysql)
    HashMap<Integer,Nurse>nurseDb=new HashMap<>();
    public String addNurse(Nurse nurse){
        int key=nurse.getNurseId();
        nurseDb.put(key,nurse);
        return "Nurse added successfully";
    }
    public List<Nurse> getAllNurses(){
        List<Nurse> nurses=new ArrayList<>();
        for(Nurse n:nurseDb.values())
            nurses.add(n);
        return nurses;
    }
}
