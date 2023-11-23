package avatar.domain;

import avatar.domain.*;
import avatar.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class AvatarEntered extends AbstractEvent {

    private Long id;
    private String name;
    private Integer level;
    private Integer hp;
    private Integer dp;
    private Integer ap;
    private Double exp;

    public AvatarEntered(Avatar aggregate) {
        super(aggregate);
    }

    public AvatarEntered() {
        super();
    }
}
//>>> DDD / Domain Event
