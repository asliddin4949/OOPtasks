package Task8Songs;
import lombok.Getter;
@Getter
public class Song {

    private final int code;
    private final String name;
    private int voteNumbers;
    private final Singer singer;

    public Song(int code, String name, Singer singer) {
        this.code = code;
        this.name = name;
        this.singer = singer;
    }
    public void addVote(){
        this.voteNumbers+=1;
    }
}
