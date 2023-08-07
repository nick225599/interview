package org.nick.spi.invoker;

import org.nick.spi.facade.EchoService;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<EchoService> serviceLoader = ServiceLoader.load(EchoService.class);
        for(EchoService service : serviceLoader){
            String responseMsg = service.echo("PING");
            System.out.println("response from " + service.getClass().getName() + " is: " + responseMsg);
        }
    }
}
