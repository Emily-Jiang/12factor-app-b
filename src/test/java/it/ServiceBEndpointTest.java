package it;

import org.junit.Test;

public class ServiceBEndpointTest extends EndpointTest {

    @Test
    public void testDeployment() {
        testEndpoint("/demo/b", 200, "Hello from serviceB");
    }
}
