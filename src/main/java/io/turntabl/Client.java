package io.turntabl;

public class Client
        implements Nameable, HasServiceLevel
{

    private String ClientName;
    private int ClientID;
    private ServiceLevel Lvl;

    public Client(String clientName, int clientID, ServiceLevel lvl) {
        ClientName = clientName;
        ClientID = clientID;
        Lvl = lvl;
    }

    @Override
    public ServiceLevel getServiceLevel() {
        return Lvl;
    }

    @Override
    public String getName() {
        return ClientName;
    }
}
