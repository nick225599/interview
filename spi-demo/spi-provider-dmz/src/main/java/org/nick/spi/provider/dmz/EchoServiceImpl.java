package org.nick.spi.provider.dmz;

import org.nick.spi.facade.EchoService;

public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String msg) {
        return msg;
    }
}
