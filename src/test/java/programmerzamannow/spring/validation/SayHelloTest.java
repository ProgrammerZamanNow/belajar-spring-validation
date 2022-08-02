package programmerzamannow.spring.validation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import programmerzamannow.spring.validation.helper.SayHello;

import javax.validation.ConstraintViolationException;

@SpringBootTest
public class SayHelloTest {

  @Autowired
  private SayHello sayHello;

  @Test
  void testSuccess() {
    String message = sayHello.sayHello("Eko");
    Assertions.assertEquals("Hello Eko", message);
  }

  @Test
  void testError() {
    Assertions.assertThrows(ConstraintViolationException.class, () -> {
      sayHello.sayHello("");
    });
  }
}
