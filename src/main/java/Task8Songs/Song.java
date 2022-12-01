package Task8Songs;

import lombok.Data;

@Data
public class Song {
    private int code;
    private String name;
    private int voteNumbers;
    private Singer singer;


}
