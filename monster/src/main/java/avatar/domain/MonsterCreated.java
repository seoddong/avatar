package avatar.domain;

import avatar.domain.*;
import avatar.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class MonsterCreated extends AbstractEvent {

    private Long id;
    private String name;
    private Integer level;
    private Integer ap;
    private Integer dp;
    private Integer hp;

    public MonsterCreated(Monster aggregate) {
        super(aggregate);
    }

    public MonsterCreated() {
        super();
    }
}
//>>> DDD / Domain Event
