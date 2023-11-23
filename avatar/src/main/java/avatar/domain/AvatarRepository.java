package avatar.domain;

import avatar.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "avatars", path = "avatars")
public interface AvatarRepository
    extends PagingAndSortingRepository<Avatar, Long> {}
