package avatar.common;

import avatar.MonsterApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MonsterApplication.class })
public class CucumberSpingConfiguration {}
