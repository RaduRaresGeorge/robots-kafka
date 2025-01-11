package uax.robotskafka;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TaskController {

    private final TaskProducer taskProducer;

    public TaskController(TaskProducer taskProducer) {
        this.taskProducer = taskProducer;
    }

    @PostMapping("/{topic}")
    public void sendTask(@PathVariable String topic, @RequestBody String task) {
        taskProducer.sendTask(topic, task);
        System.out.println("Task sent to topic " + topic);
    }


}
