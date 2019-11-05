package io.turntabl;

import javafx.concurrent.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.stream.Collectors;

public class ClientRegister {

    private List<Client> clients;

    public ClientRegister(List<Client> clients) {
        this.clients = clients;
    }

    public List<String> getClientRegister(ServiceLevel lvl) {
        return clients.stream().filter(client -> client.getServiceLevel() == lvl.GOLD)
                .map(Client::getName)
                .collect(Collectors.toList()); }

    public Optional<String> getClientNameByID(int id) {
        for (Client client : clients)
            if (client.getID() == id) {
                return Optional.of(client.getName());
            } else {
                return Optional.empty();
            }
            return null;
    }

//    public List<String> getClientsAtServiceLvl(ServiceLevel){
//            return clients.stream().map()
//
////                long count =Client.stream().distinct().count();
////                    return  total;
//    }

}

