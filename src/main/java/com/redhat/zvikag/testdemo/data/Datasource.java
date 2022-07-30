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
        phonetics.put(62,"62");
        phonetics.put(63,"63");
        phonetics.put(64,"64");
        phonetics.put(65,"65");
        phonetics.put(66,"66");
        phonetics.put(67,"67");
        phonetics.put(68,"68");
        phonetics.put(69,"69");
        phonetics.put(70,"70");
        phonetics.put(71,"71");
        phonetics.put(72,"72");
        phonetics.put(73,"73");
        phonetics.put(74,"74");
        phonetics.put(75,"75");
        phonetics.put(76,"76");
        phonetics.put(77,"77");
        phonetics.put(78,"78");
        phonetics.put(79,"79");
        phonetics.put(80,"80");
        phonetics.put(81,"81");
        phonetics.put(82,"82");
        phonetics.put(83,"83");
        phonetics.put(84,"84");
        phonetics.put(85,"85");
        phonetics.put(86,"86");
        phonetics.put(87,"87");
        phonetics.put(88,"88");
        phonetics.put(89,"89");
        phonetics.put(90,"90");
        phonetics.put(91,"91");
        phonetics.put(92,"92");
        phonetics.put(93,"93");
        phonetics.put(94,"94");
        phonetics.put(95,"95");
        phonetics.put(96,"96");
        phonetics.put(97,"97");
        phonetics.put(98,"98");
        phonetics.put(99,"99");
        phonetics.put(100,"100");
        phonetics.put(101,"101");
        phonetics.put(102,"102");
        phonetics.put(103,"103");
        phonetics.put(104,"104");
        phonetics.put(105,"105");
        phonetics.put(106,"106");
        phonetics.put(107,"107");
        phonetics.put(108,"108");
        phonetics.put(109,"109");
        phonetics.put(110,"110");
        phonetics.put(111,"111");
        phonetics.put(112,"112");
        phonetics.put(113,"113");
        phonetics.put(114,"114");
        phonetics.put(115,"115");
        phonetics.put(116,"116");
        phonetics.put(117,"117");
        phonetics.put(118,"118");
        phonetics.put(119,"119");
        phonetics.put(120,"120");
        phonetics.put(121,"121");
        phonetics.put(122,"122");
        phonetics.put(123,"123");
        phonetics.put(124,"124");
//HERE!
    }

}



