package avatar.common;

import avatar.BattleApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BattleApplication.class })
public class CucumberSpingConfiguration {}
