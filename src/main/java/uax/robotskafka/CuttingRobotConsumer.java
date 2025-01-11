package uax.robotskafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CuttingRobotConsumer {

    @KafkaListener(topics = "cutting-tasks", groupId = "robot-group")
    public void consume(String task) {
        System.out.println("Cutting robot consumed task: " + task);
    }

}
