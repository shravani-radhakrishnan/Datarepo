package com.shravs.runner;

import com.shravs.Entity.CitizenPlan;
import com.shravs.repo.CitizenPlanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    private CitizenPlanRepo repo;
    @Override
    public void run(ApplicationArguments args) throws Exception{
        CitizenPlan p1 = new CitizenPlan("John","john@gmail.com","Male",31234l,768568439l,"Cash","Approved", LocalDate.now(),LocalDate.now().plusMonths(6));
        CitizenPlan p2 = new CitizenPlan("Jey","jey@gmail.com","Male",51234l,68568439l,"Cash","Rejected", null,null);
        CitizenPlan p3 = new CitizenPlan("Sam","sam@gmail.com","Female",21234l,468568439l,"Food","Approved", LocalDate.now(),LocalDate.now().plusMonths(6));
        CitizenPlan p4 = new CitizenPlan("Tanvi","tanvi@gmail.com","Female",61234l,47568439l,"Food","Rejected", null,null);
        CitizenPlan p5 = new CitizenPlan("Avi","avi@gmail.com","Male",81234l,6856439l,"Medical","Approved", LocalDate.now(),LocalDate.now().plusMonths(6));
        CitizenPlan p6 = new CitizenPlan("rahul","rahul@gmail.com","Male",91234l,468439l,"Medical","Rejected", null,null);

        List<CitizenPlan> records = Arrays.asList(p1,p2,p3,p4,p5,p6);
        repo.saveAll(records);
    }
}
