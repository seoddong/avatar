package avatar.domain;

import avatar.domain.*;
import avatar.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class MonsterCreated extends AbstractEvent {

    private Long id;
    private String name;
    private Integer level;
    private Integer ap;
    private Integer dp;
    private Integer hp;
}
