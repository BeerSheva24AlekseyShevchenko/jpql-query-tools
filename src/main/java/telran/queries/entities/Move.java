package telran.queries.entities;

import jakarta.persistence.*;

@Table(name = "move")
@Entity
public class Move {
    @Id
    @GeneratedValue
    long id;
    int bools;
    int cows;
    String sequence;
    @ManyToOne
    @JoinColumn(name = "game_gamer_id")
    GameGamer gameGamer;

    @Override
    public String toString() {
        return "Move [id=" + id + ", bools=" + bools + ", cows=" + cows + ", sequence=" + sequence + ", gameGamer="
                + gameGamer.id + "]";
    }
}
