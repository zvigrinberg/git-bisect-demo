package com.redhat.zvikag.testdemo.data;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
@Data
public class Datasource {

    private Map<Integer,String> phonetics;

    @PostConstruct
    void populatePhonetics()
    {
        populatePhoneticsImpl();


    }

    public Datasource() {
         populatePhoneticsImpl();

    }

    private void populatePhoneticsImpl() {
        phonetics = new HashMap<>();
        phonetics.put(1,"One");
        phonetics.put(2,"Two");
        phonetics.put(3,"Three");
        phonetics.put(4,"Four");
        phonetics.put(5,"Five");
        phonetics.put(6,"Six");
        phonetics.put(7,"Seven");
        phonetics.put(8,"Eight");
        phonetics.put(9,"Nine");
        phonetics.put(10,"Ten");
        phonetics.put(11,"Eleven");
        phonetics.put(12,"12");
//HERE!
    }

}



