package avatar.domain;

import avatar.domain.*;
import avatar.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FightFinished extends AbstractEvent {

    private Long id;
}
