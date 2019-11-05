package io.turntabl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import javafx.concurrent.Service;

class ClientRegisterTest {

    @Test
    void testGetClientRegister() {
        ClientRegister clientRegister = new ClientRegister(Arrays.asList(
             new Client("Bernard", 101, ServiceLevel.GOLD),
             new Client("Abena", 102, ServiceLevel.PLATINUM),
             new Client("Kwaku", 103, ServiceLevel.PLATINUM),
             new Client("Mark", 104, ServiceLevel.PREMIUM),
             new Client("John", 105, ServiceLevel.PLATINUM),
             new Client("Alice", 106, ServiceLevel.GOLD),
             new Client("Yaa", 107, ServiceLevel.GOLD),
        ));
        assertEquals(Arrays.asList("Bernard", "Alice", "Yaa"), clientRegister.getClientRegister(ServiceLevel.GOLD));
    }

    @Test
    void testGetClientNameByID() {
    }
}