package pl.trzeciawnocy.kafkaschemas;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")
public class UserEventController {

    private final SomeEventProducer producer;

    public UserEventController(SomeEventProducer producer) {
        this.producer = producer;
    }

    @GetMapping
    public ResponseEntity<String> sendEvent() {
        producer.send();
        return ResponseEntity.ok("Event sent");
    }
}