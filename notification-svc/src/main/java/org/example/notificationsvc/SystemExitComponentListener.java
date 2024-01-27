package org.example.notificationsvc;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SystemExitComponentListener {

    @Value("${SERVICE_NOTIFICATION_EXIT:false}")
    private boolean shouldExit;

    @SneakyThrows
    @EventListener
    public void listener(ApplicationReadyEvent event) {
        if (!shouldExit) {
            return;
        }

        log.info("I AM GONNA RUN SYSTEM EXIT 1 IN 10 SEC");
        Thread.sleep(10000);
        System.exit(1);
    }
}
