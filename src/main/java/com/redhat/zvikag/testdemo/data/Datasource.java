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
        phonetics.put(13,"13");
        phonetics.put(14,"14");
        phonetics.put(15,"15");
        phonetics.put(16,"16");
        phonetics.put(17,"17");
        phonetics.put(18,"18");
        phonetics.put(19,"19");
        phonetics.put(20,"20");
        phonetics.put(21,"21");
        phonetics.put(22,"22");
        phonetics.put(23,"23");
        phonetics.put(24,"24");
        phonetics.put(25,"25");
        phonetics.put(26,"26");
        phonetics.put(27,"27");
        phonetics.put(28,"28");
        phonetics.put(29,"29");
        phonetics.put(30,"30");
        phonetics.put(31,"31");
        phonetics.put(32,"32");
        phonetics.put(33,"33");
        phonetics.put(34,"34");
        phonetics.put(35,"35");
        phonetics.put(36,"36");
        phonetics.put(37,"37");
        phonetics.put(38,"38");
        phonetics.put(39,"39");
        phonetics.put(40,"40");
        phonetics.put(41,"41");
        phonetics.put(42,"42");
        phonetics.put(43,"43");
        phonetics.put(44,"44");
        phonetics.put(45,"45");
        phonetics.put(46,"46");
        phonetics.put(47,"47");
        phonetics.put(48,"48");
        phonetics.put(49,"49");
        phonetics.put(50,"50");
        phonetics.put(51,"51");
        phonetics.put(52,"52");
        phonetics.put(53,"53");
        phonetics.put(54,"54");
        phonetics.put(55,"55");
        phonetics.put(56,"56");
        phonetics.put(57,"57");
        phonetics.put(58,"58");
        phonetics.put(59,"59");
        phonetics.put(60,"60");
        phonetics.put(61,"61");
//HERE!
    }

}



