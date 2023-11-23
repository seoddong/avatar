package avatar.infra;

import avatar.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class MonsterHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Monster>> {

    @Override
    public EntityModel<Monster> process(EntityModel<Monster> model) {
        return model;
    }
}
