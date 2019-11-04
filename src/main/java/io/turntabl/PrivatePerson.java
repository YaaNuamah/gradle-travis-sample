package io.turntabl;

import java.util.List;


public class PrivatePerson {
    public String PersonName;
    public int PriID;
    public ServiceLevel lvl;
    public List<PrivatePerson> clients;

    public PrivatePerson(String personName, int priID, ServiceLevel lvl, List<PrivatePerson> clients) {
        PersonName = personName;
        PriID = priID;
        this.lvl = lvl;
        this.clients = clients;
    }

    public String getPersonName() {return PersonName; }

    public int getPriID() {return PriID; }

    public ServiceLevel getLvl() { return lvl; }

    @Override
    public String toString() {
        return "PrivatePerson{" +
                "PersonName='" + PersonName + '\'' +
                ", PriID=" + PriID +
                ", lvl=" + lvl +
                ", clients=" + clients +
                '}';
    }
}


    //    public List<String> getPersonName() {
//        return clients.stream().map(PrivatePerson ::getPersonName)
//                .collect(Collectors.toList());





