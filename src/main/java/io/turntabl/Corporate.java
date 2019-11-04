package io.turntabl;

import com.sun.security.ntlm.Client;

import java.util.List;

public class Corporate {
    public String AccountManagerName;
    public int CorpID;
    public ServiceLevel Lvl;
    public List<Corporate> clients;

    public Corporate(String accountManagerName, int corpID, ServiceLevel lvl, List<Corporate> clients) {
        AccountManagerName = accountManagerName;
        CorpID = corpID;
        Lvl = lvl;
        this.clients = clients;

    }

    public String getAccountManagerNameName() {return AccountManagerName; }
}

