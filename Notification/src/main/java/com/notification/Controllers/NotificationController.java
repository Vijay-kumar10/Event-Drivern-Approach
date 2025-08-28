package com.notification.Controllers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/not")
public class NotificationController {


    @PostMapping
    public ResponseEntity<?> sendNotification() {
        return ResponseEntity.ok("Notification sent");
    }

    @GetMapping("/get")
    public ResponseEntity<?> recieveNotification() {
        return ResponseEntity.ok("Notification Recieved");
    }
}
