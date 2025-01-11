package uax.robotskafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class BendingRobotConsumer {

    @KafkaListener(topics = "bending-tasks", groupId = "robot-group")
    public void consume(String task) {
        System.out.println("Bending robot consumed task: " + task);
    }

}
