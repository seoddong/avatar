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
    MonsterRepository monsterRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='AvatarEntered'"
    )
    public void wheneverAvatarEntered_MeetMonster(
        @Payload AvatarEntered avatarEntered
    ) {
        AvatarEntered event = avatarEntered;
        System.out.println(
            "\n\n##### listener MeetMonster : " + avatarEntered + "\n\n"
        );

        // Sample Logic //
        Monster.meetMonster(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
