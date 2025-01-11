package uax.robotskafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class StackingRobotConsumer {

    @KafkaListener(topics = "stacking-task", groupId = "robot-group")
    public void consume(String message) {
        System.out.println("Stacking Robot received: " + message);
    }

}
