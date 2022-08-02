package programmerzamannow.spring.validation.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
@ConfigurationProperties("database")
public class DatabaseProperties {

  @NotBlank
  private String username;

  @NotBlank
  private String password;
}
