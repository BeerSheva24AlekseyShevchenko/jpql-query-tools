package telran.queries.entities;

import jakarta.persistence.*;

@Table(name = "game_gamer")
@Entity
public class GameGamer {
    @Id
    @GeneratedValue
    long id;
    @ManyToOne
    @JoinColumn(name = "game_id")
    Game game;
    @ManyToOne
    @JoinColumn(name = "gamer_id")
    Gamer gamer;
    @Column(name = "is_winner")
    boolean isWinner;

    @Override
    public String toString() {
        return "GameGamer [id=" + id + ", game=" + game.id + ", gamer=" + gamer.username + ", isWinner=" + isWinner + "]";
    }  
}
