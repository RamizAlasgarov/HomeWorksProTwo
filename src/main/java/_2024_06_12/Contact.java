package _2024_06_12;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Contact {
    private int id;
    private String name;
    private long phoneNumber;
    private String email;
}
