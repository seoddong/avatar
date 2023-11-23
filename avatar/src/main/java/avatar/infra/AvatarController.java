package avatar.infra;

import avatar.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/avatars")
@Transactional
public class AvatarController {

    @Autowired
    AvatarRepository avatarRepository;

    @RequestMapping(
        value = "avatars/{id}/intobattlefield",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Avatar intoBattlefield(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /avatar/intoBattlefield  called #####");
        Optional<Avatar> optionalAvatar = avatarRepository.findById(id);

        optionalAvatar.orElseThrow(() -> new Exception("No Entity Found"));
        Avatar avatar = optionalAvatar.get();
        avatar.intoBattlefield();

        avatarRepository.save(avatar);
        return avatar;
    }
}
//>>> Clean Arch / Inbound Adaptor
