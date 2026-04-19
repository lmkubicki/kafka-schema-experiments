package pl.trzeciawnocy.kafkaconsumer;

import pl.trzeciawnocy.events.EventEnvelope;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class SomeEventListener {

    public static final String TOPIC_NAME = "some-events";

    @KafkaListener(topics = TOPIC_NAME, groupId = "user-group")
    public void listen(EventEnvelope event) {
        System.out.println("Event has been retrieved: " + event.toString());
        System.out.println(event.getEvent().getClass());
    }
}
