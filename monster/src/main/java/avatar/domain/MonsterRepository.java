package avatar.domain;

import avatar.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "monsters", path = "monsters")
public interface MonsterRepository
    extends PagingAndSortingRepository<Monster, Long> {}
