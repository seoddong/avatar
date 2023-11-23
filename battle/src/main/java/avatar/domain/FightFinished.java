package avatar.domain;

import avatar.domain.*;
import avatar.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class FightFinished extends AbstractEvent {

    private Long id;

    public FightFinished(Battle aggregate) {
        super(aggregate);
    }

    public FightFinished() {
        super();
    }
}
//>>> DDD / Domain Event
