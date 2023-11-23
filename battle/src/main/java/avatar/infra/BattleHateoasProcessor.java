package avatar.infra;

import avatar.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class BattleHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Battle>> {

    @Override
    public EntityModel<Battle> process(EntityModel<Battle> model) {
        return model;
    }
}
