
package Callers;

import java.util.Arrays;

public class Customer  {
  private int customerID;
  private String name;
  private String passportNumber;
  private double balance;
  private Calls[] calls;
  private Tariff tariff;

  public int getCustomerID() {
    return customerID;
  }

  public String getName() {
    return name;
  }

  public String getPassportNumber() {
    return passportNumber;
  }

  public double getBalance() {
    return balance;
  }

  public Calls[] getCalls() {
    return calls;
  }

  public Tariff getTariff() {
    return tariff;
  }

  public Customer(int customerID, String name, String passportNumber, double balance, Tariff tariff) {
    this.customerID = customerID;
    this.name = name;
    this.passportNumber = passportNumber;
    this.balance = balance;
    this.tariff = tariff;
  }

  public Customer(int customerID, String name, String passportNumber, double balance, Calls[] calls, Tariff tariff) {
    this.customerID = customerID;
    this.name = name;
    this.passportNumber = passportNumber;
    this.balance = balance;
    this.calls = calls;
    this.tariff = tariff;
  }

  public void setCustomerID(int customerID) {
    this.customerID = customerID;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setCalls(Calls[] calls) {
    this.calls = calls;
  }

  public void setTariff(Tariff tariff) {
    this.tariff = tariff;
  }

  @Override
  public String toString() {
    return "Customer: [" +
            "customerID=" + customerID +
            ", name='" + name + '\'' +
            ", passportNumber='" + passportNumber + '\'' +
            ", balance=" + balance +
            ", calls=" + Arrays.toString(calls) +
            ", tariff=" + tariff +
            ']';
  }
}
