package _24_06_21;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Contact {
    private String name;
    private String surname;
    private String number;
    private String email;
}
