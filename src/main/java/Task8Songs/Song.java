package Task8Songs;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Data
@AllArgsConstructor

public class Song {

    private int code;
    private String name;
    private int voteNumbers;
    private Singer singer;
    private int votedUserId;
}
