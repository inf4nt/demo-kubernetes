package org.example.coresvc;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping
public class CoreSvcController {
    public static final String PROCESS_ID = UUID
            .randomUUID()
            .toString()
            .replace("-", "");

    @Autowired
    private NotificationSvcClient notificationSvcClient;

    @SneakyThrows
    @GetMapping
    public Object get() {
        Thread.sleep(200);
        return new LinkedHashMap<>() {{
            put("application_name", "notification-svc");
            put("process_id", PROCESS_ID);
        }};
    }

    @GetMapping("/notification")
    public ResponseEntity<?> ask() {
        return notificationSvcClient.getNameAndProcessId();
    }
}
