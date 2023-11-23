package avatar.domain;

import avatar.AvatarApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Avatar_table")
@Data
//<<< DDD / Aggregate Root
public class Avatar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Integer level;

    private Integer hp;

    private Integer dp;

    private Integer ap;

    private Double exp;

    @PostPersist
    public void onPostPersist() {}

    public static AvatarRepository repository() {
        AvatarRepository avatarRepository = AvatarApplication.applicationContext.getBean(
            AvatarRepository.class
        );
        return avatarRepository;
    }

    //<<< Clean Arch / Port Method
    public void createAvatar() {
        //implement business logic here:

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void intoBattlefield() {
        //implement business logic here:

        AvatarEntered avatarEntered = new AvatarEntered(this);
        avatarEntered.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method

    //<<< Clean Arch / Port Method
    public static void avatarUpdate(FightFinished fightFinished) {
        //implement business logic here:

        /** Example 1:  new item 
        Avatar avatar = new Avatar();
        repository().save(avatar);

        */

        /** Example 2:  finding and process
        
        repository().findById(fightFinished.get???()).ifPresent(avatar->{
            
            avatar // do something
            repository().save(avatar);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
