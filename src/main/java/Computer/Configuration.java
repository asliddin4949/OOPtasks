package Computer;

import lombok.Getter;

@Getter
public class Configuration  {
    private String RAM;
    private String ROM;
    private String CPU;
    private String display;
    private boolean register;


    public Configuration( String RAM, String ROM, String CPU, String display, boolean register) {
        this.RAM = RAM;
        this.ROM = ROM;
        this.CPU = CPU;
        this.display = display;
        this.register = register;
    }

    @Override
    public String toString() {
        return " Configuration: [ RAM: " +this.RAM+" ROM: " +this.ROM
                +" CPU: "+this.CPU +" Display: "+this.display +" isRegistered: "+(this.register?"Yes":"No")+"]";
    }
}
