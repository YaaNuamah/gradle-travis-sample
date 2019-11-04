package io.turntabl;

import com.sun.security.ntlm.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrivatePerson {
    public String PersonName;
    public int PriID;
    public ServiceLevel lvl;


    public PrivatePerson(String personName, int priID, ServiceLevel lvl) {
        PersonName = personName;
        PriID = priID;
        this.lvl = lvl;

    }

    public String getPersonName() {return PersonName; }


//    public List<String> getPersonName() {
//        return clients.stream().map(PrivatePerson ::getPersonName)
//                .collect(Collectors.toList());

    }



