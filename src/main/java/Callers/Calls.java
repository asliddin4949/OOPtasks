package Callers;

public class Calls {
    private int callID;
    private String phoneNumber;
    private String dialedNumber;
    private String date;
    private Integer callDuration;

    public int getCallID() {
        return callID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDialedNumber() {
        return dialedNumber;
    }

    public String getDate() {
        return date;
    }

    public Integer getCallDuration() {
        return callDuration;
    }

    public Calls(int callID, String phoneNumber, String dialedNumber, String date, Integer callDuration) {
        this.callID = callID;
        this.phoneNumber = phoneNumber;
        this.dialedNumber = dialedNumber;
        this.date = date;
        this.callDuration = callDuration;
    }

    @Override
    public String toString() {
        return "Calls: [" +
                "callID=" + callID +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", dialedNumber='" + dialedNumber + '\'' +
                ", date='" + date + '\'' +
                ", callDuration=" + callDuration +
                ']';
    }
}
