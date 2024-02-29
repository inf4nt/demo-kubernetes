package org.example.notificationsvc;

import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.UUID;

@RestController
@RequestMapping
public class NotificationSvcController {
    public static final String PROCESS_ID = UUID
            .randomUUID()
            .toString()
            .replace("-", "");

    @SneakyThrows
    @GetMapping
    public Object index() {
        Thread.sleep(200);
        return new LinkedHashMap<>() {{
            put("application_name", "notification-svc");
            put("process_id", PROCESS_ID);
        }};
    }
}
