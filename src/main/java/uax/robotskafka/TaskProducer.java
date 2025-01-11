package uax.robotskafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class TaskProducer {

        private final KafkaTemplate<String, String> kafkaTemplate;

        public TaskProducer(KafkaTemplate<String, String> kafkaTemplate) {
            this.kafkaTemplate = kafkaTemplate;
        }

        public void sendTask(String topic, String task) {
            kafkaTemplate.send(topic, task);
            System.out.println("Sent task to: " + topic + ": " + task);
        }
}
