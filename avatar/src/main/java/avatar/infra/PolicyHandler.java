package avatar.infra;

import avatar.config.kafka.KafkaProcessor;
import avatar.domain.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    AvatarRepository avatarRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FightFinished'"
    )
    public void wheneverFightFinished_AvatarUpdate(
        @Payload FightFinished fightFinished
    ) {
        FightFinished event = fightFinished;
        System.out.println(
            "\n\n##### listener AvatarUpdate : " + fightFinished + "\n\n"
        );

        // Sample Logic //
        Avatar.avatarUpdate(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
