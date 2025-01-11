package uax.robotskafka;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.apache.kafka.clients.admin.NewTopic;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic cuttingTaskTopic() {
        return new NewTopic("cutting-task", 1, (short) 1);
    }

    @Bean
    public NewTopic bendingTaskTopic() {
        return new NewTopic("bending-task", 1, (short) 1);
    }

    @Bean
    public NewTopic stackingTaskTopic() {
        return new NewTopic("stacking-task", 1, (short) 1);
    }

    @Bean
    public NewTopic transportingTaskTopic() {
        return new NewTopic("transporting-task", 1, (short) 1);
    }

}
