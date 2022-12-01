package Callers;


public class Tariff {
    private String tariffName;
    private double minuteCost;
    private String companyName;

    public String getTariffName() {
        return tariffName;
    }

    public double getMinuteCost() {
        return minuteCost;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Tariff() {
    }

    public Tariff(String tariffName, double minuteCost, String companyName) {
        this.tariffName = tariffName;
        this.minuteCost = minuteCost;
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Tariff: [" +
                "tariffName='" + tariffName + '\'' +
                ", minuteCost=" + minuteCost +
                ", companyName='" + companyName + '\'' +
                ']';
    }
}
