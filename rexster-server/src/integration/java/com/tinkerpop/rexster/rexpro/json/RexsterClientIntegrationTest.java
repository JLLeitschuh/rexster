package com.tinkerpop.rexster.rexpro.json;

import com.tinkerpop.rexster.client.RexsterClient;
import com.tinkerpop.rexster.client.RexsterClientFactory;
import com.tinkerpop.rexster.rexpro.AbstractRexsterClientIntegrationTest;

public class RexsterClientIntegrationTest extends AbstractRexsterClientIntegrationTest {

    @Override
    public boolean supportsPrimitiveKeys() {
        return false;
    }

    @Override
    public RexsterClient getClient() throws Exception {
        RexsterClient client = RexsterClientFactory.open();
        client.setSerializer((byte) 1);
        return client;
    }
}
