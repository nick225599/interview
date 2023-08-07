package org.nick.spi.provider.ptr;

import org.nick.spi.facade.EchoService;

public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String msg) {
        return msg;
    }
}
