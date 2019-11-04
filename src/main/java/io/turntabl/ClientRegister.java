package io.turntabl;

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
                .collect(Collectors.toList());
    }

//    public Optional<Client> getClientByID(int id) {
//        for(Client client :clients)
//    }



        }


