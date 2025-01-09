package telran.queries.entities;
import java.time.LocalDate;

import jakarta.persistence.*;

@Table(name="gamer")
@Entity
public class Gamer {
    @Id
    String username;
    LocalDate birthdate;

    @Override
    public String toString() {
        return "Gamer [username=" + username + ", birthdate=" + birthdate + "]";
    }
}
