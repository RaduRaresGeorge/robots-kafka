package uax.robotskafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TransportingRobotConsumer {

    @KafkaListener(topics = "transporting-task", groupId = "robot-group")
    public void consume(String task) {
        System.out.println("Transporting robot consumed task: " + task);
    }

}
