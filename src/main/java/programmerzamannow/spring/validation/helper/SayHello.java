package programmerzamannow.spring.validation.helper;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@Component
public class SayHello implements ISayHello{

  public String sayHello(@NotBlank String name) {
    return "Hello " + name;
  }
}
