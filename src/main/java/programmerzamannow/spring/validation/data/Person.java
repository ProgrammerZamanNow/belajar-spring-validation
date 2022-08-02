package programmerzamannow.spring.validation.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

  @NotBlank
  private String id;

  @NotBlank
  private String name;

}
