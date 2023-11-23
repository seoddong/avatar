package avatar.infra;

import avatar.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class AvatarHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Avatar>> {

    @Override
    public EntityModel<Avatar> process(EntityModel<Avatar> model) {
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() + "/intobattlefield"
                )
                .withRel("intobattlefield")
        );

        return model;
    }
}
