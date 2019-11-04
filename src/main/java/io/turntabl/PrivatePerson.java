package io.turntabl;




public class PrivatePerson extends Client {
    public PrivatePerson(String clientName, int clientID, ServiceLevel lvl) {
        super(clientName, clientID, lvl);


    }

    @Override
    public ServiceLevel getServiceLevel() {
        return super.getServiceLevel();
    }

    @Override
    public String getName() {
        return super.getName();
    }


}



