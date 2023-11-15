package Adapter;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter

public class Info {
    private String name;
    private String surname;
    private LocalDate birthDate;

    public Info(String name, String surname, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public Info() {

    }
}
