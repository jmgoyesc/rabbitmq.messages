package com.github.jmgoyesc;

import lombok.extern.jbosslog.JBossLog;
import lombok.extern.log4j.Log4j2;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author Juan Manuel Goyes Coral
 */

@ApplicationScoped
@JBossLog
public class Consumer {

    @Incoming("external-input")
    public void consume(String text) {
        log.infov("I got a message. {0}", text);
    }

}
