package de.bernard.services.listener;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SensorDataListener {

    @Incoming("sensor")
    public void consume(byte[] raw) {
        log.info(raw);
    }

    private static final Logger log = Logger.getLogger(SensorDataListener.class);
}
