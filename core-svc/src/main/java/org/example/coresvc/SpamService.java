package org.example.coresvc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
@Component
public class SpamService {

    @Autowired
    private NotificationSvcClient notificationSvcClient;

    private final ExecutorService executorService = Executors.newFixedThreadPool(10);

    @Scheduled(fixedDelay = 100)
    public void spam() {
        executorService
                .execute(() -> {
                    try {
                        ResponseEntity<?> response = notificationSvcClient
                                .getNameAndProcessId();

                        log.info("Notification svc. Status code {}, body {}",
                                response.getStatusCode(),
                                response.getBody()
                        );
                    } catch (Throwable t) {
                        t.printStackTrace();
                    }
                });
    }
}
