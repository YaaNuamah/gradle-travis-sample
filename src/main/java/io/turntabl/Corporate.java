package io.turntabl;

import java.util.List;

public class Corporate extends Client{
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

    public int getCorpID() { return CorpID; }

    public ServiceLevel getLvl() { return Lvl; }

    @Override
    public String toString() {
        return "Corporate{" +
                "AccountManagerName='" + AccountManagerName + '\'' +
                ", CorpID=" + CorpID +
                ", Lvl=" + Lvl +
                ", clients=" + clients +
                '}';
    }
}

