package avatar.domain;

import avatar.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "battles", path = "battles")
public interface BattleRepository
    extends PagingAndSortingRepository<Battle, Long> {}
