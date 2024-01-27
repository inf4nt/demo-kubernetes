package org.example.coresvc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "notification-svc", url = "${SERVICE_NOTIFICATION_URL:localhost:8085}")
public interface NotificationSvcClient {

    @GetMapping
    ResponseEntity<?> getNameAndProcessId();
}
