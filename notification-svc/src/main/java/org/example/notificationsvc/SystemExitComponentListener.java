package org.example.notificationsvc;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@ConditionalOnProperty(name = "SERVICE_NOTIFICATION_EXIT", havingValue = "true")
public class SystemExitComponentListener {

    @SneakyThrows
    @EventListener(ApplicationReadyEvent.class)
    public void listener() {
        log.info("I AM GONNA RUN 'System.exit(1)' IN 10 SEC");
        Thread.sleep(10000);
        System.exit(1);
    }
}
