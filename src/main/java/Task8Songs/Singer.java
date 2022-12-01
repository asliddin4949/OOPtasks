package Task8Songs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
@Getter
@Setter
@Data
public class Singer {

    private int singerId;
    private String username;
    private String name;
    private int age;

}
