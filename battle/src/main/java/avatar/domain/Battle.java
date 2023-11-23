package avatar.domain;

import avatar.BattleApplication;
import avatar.domain.FightFinished;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Battle_table")
@Data
//<<< DDD / Aggregate Root
public class Battle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long monsterId;

    private Boolean isVictory;

    private Integer monsterHp;

    @PostPersist
    public void onPostPersist() {
        FightFinished fightFinished = new FightFinished(this);
        fightFinished.publishAfterCommit();
    }

    public static BattleRepository repository() {
        BattleRepository battleRepository = BattleApplication.applicationContext.getBean(
            BattleRepository.class
        );
        return battleRepository;
    }

    //<<< Clean Arch / Port Method
    public static void fight(MonsterCreated monsterCreated) {
        //implement business logic here:

        /** Example 1:  new item 
        Battle battle = new Battle();
        repository().save(battle);

        FightFinished fightFinished = new FightFinished(battle);
        fightFinished.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(monsterCreated.get???()).ifPresent(battle->{
            
            battle // do something
            repository().save(battle);

            FightFinished fightFinished = new FightFinished(battle);
            fightFinished.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
