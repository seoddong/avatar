package avatar.domain;

import avatar.MonsterApplication;
import avatar.domain.MonsterCreated;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Monster_table")
@Data
//<<< DDD / Aggregate Root
public class Monster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Integer level;

    private Integer ap;

    private Integer dp;

    private Integer hp;

    @PostPersist
    public void onPostPersist() {
        MonsterCreated monsterCreated = new MonsterCreated(this);
        monsterCreated.publishAfterCommit();
    }

    public static MonsterRepository repository() {
        MonsterRepository monsterRepository = MonsterApplication.applicationContext.getBean(
            MonsterRepository.class
        );
        return monsterRepository;
    }

    //<<< Clean Arch / Port Method
    public static void meetMonster(AvatarEntered avatarEntered) {
        //implement business logic here:

        /** Example 1:  new item 
        Monster monster = new Monster();
        repository().save(monster);

        MonsterCreated monsterCreated = new MonsterCreated(monster);
        monsterCreated.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(avatarEntered.get???()).ifPresent(monster->{
            
            monster // do something
            repository().save(monster);

            MonsterCreated monsterCreated = new MonsterCreated(monster);
            monsterCreated.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
