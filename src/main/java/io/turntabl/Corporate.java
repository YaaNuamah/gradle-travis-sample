package io.turntabl;

import java.util.List;

public class Corporate extends Client {


    public Corporate(String clientName, int clientID, ServiceLevel lvl) {
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

