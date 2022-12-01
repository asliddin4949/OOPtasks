package ComputerConf;

import lombok.Getter;
@Getter
public class Computer {
    private int id;
    private String name;
    private String type;
    private Configuration configuration;

    public Computer(int id, String name, String type,Configuration configuration) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.configuration=configuration;
    }

    @Override
    public String toString() {
        return "Computer: [" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' + configuration+
                ']';
    }
}
