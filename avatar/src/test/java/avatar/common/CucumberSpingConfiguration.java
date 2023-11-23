package avatar.common;

import avatar.AvatarApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { AvatarApplication.class })
public class CucumberSpingConfiguration {}
