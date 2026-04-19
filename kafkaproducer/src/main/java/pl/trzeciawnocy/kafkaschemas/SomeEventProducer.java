package pl.trzeciawnocy.kafkaschemas;

import pl.trzeciawnocy.events.EventEnvelope;
import pl.trzeciawnocy.events.OrderReturned;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SomeEventProducer {

    public static final String TOPIC_NAME = "some-events";
    private final KafkaTemplate<String, EventEnvelope> kafkaTemplateOrderCreated;

    public void send() {
//        UserCreated user = UserCreated.newBuilder()
//                .setUserId(UUID.randomUUID().toString())
//                .setEmail("test@test.pl")
//                .build();
//        EventEnvelope event1 = new EventEnvelope(user);
//        kafkaTemplateOrderCreated.send(TOPIC_NAME, user.getUserId(), event1);
//
//        OrderCreated order = OrderCreated.newBuilder()
//                .setOrderId(UUID.randomUUID().toString())
//                .setAmount(200)
//                .build();
//        EventEnvelope event2 = new EventEnvelope(order);
//        kafkaTemplateOrderCreated.send(TOPIC_NAME, order.getOrderId(), event2);
//
//        OrderSent sent = OrderSent.newBuilder()
//                .setOrderId(UUID.randomUUID().toString())
//                .setAmount(200)
//                .build();
//        EventEnvelope event3 = new EventEnvelope(sent);
//        kafkaTemplateOrderCreated.send(TOPIC_NAME, sent.getOrderId(), event3);
//
        OrderReturned returned = OrderReturned.newBuilder()
                .setOrderId(UUID.randomUUID().toString())
                .setAmount(205)
                .build();
        EventEnvelope event4 = new EventEnvelope(returned);
        kafkaTemplateOrderCreated.send(TOPIC_NAME, returned.getOrderId(), event4);

//        ShipmentCreated shipment = ShipmentCreated.newBuilder()
//                .setShipmentId(UUID.randomUUID().toString())
//                .setWeight(1200)
//                .build();
//        EventEnvelope event5 = new EventEnvelope(shipment);
//        kafkaTemplateOrderCreated.send(TOPIC_NAME, shipment.getShipmentId(), event5);
    }
}