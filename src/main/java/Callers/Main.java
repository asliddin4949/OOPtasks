package Callers;

public class Main {
    public static void main(String[] args) {
        Customer[] customers = new Customer[3];

        Calls[] cust1 = new Calls[5];
        Calls[] cust2 = new Calls[5];
        Calls[] cust3 = new Calls[5];

        cust1[0] = new Calls(0,"973514949","995406040","01.12.2022",17);
        cust1[1] = new Calls(1,"973514949","973112413","01.12.2022",7);

        cust2[0] = new Calls(2,"973112413","916667777","30.11.2022",57);
        cust2[1] = new Calls(3,"973112413","995606467","01.12.2022",237);

        cust3[0] = new Calls(4,"998799963","916634455","01.12.2022",null);
        cust3[1] = new Calls(5,"998799963","900443322","01.12.2022",167);


        Tariff Business = new Tariff("Business", 0.5,"MobiUZ");
        Tariff Econom = new Tariff("Econom", 0.2,"Ucell");


        customers[0] = new Customer(0,"Asliddin","AA0070707",12.3,cust1,Business);
        customers[1] = new Customer(0,"Sanjar","AA0342545",3.5,cust2,Econom);
        customers[2] = new Customer(0,"Bahodir","AA1243276",4.7,cust3,Econom);


        System.out.println("* * * * * C a l l s * * * * *");


        for (Customer customer : customers) {
            if (customer != null) {
                var calls = customer.getCalls();
                var tariff = customer.getTariff();

                for (Calls call : calls) {
                    if (call != null) {
                        double sum=0;
                        if (call.getCallDuration() != null) {
                            sum = ((call.getCallDuration() / 60) + 1) * tariff.getMinuteCost();
                            customer.setBalance(customer.getBalance() - sum);
                        }
                        System.out.println("CallID: "+call.getCallID()+"\nName: "+customer.getName()
                                +" \nPhoneNumber: "+call.getPhoneNumber()
                                +" -> to: "+call.getDialedNumber()
                                +" \nCallDuration: "+call.getCallDuration()+" \nCallCost: "+sum
                                +" \nBalance: "+customer.getBalance()+" \nTariff: "
                                 +tariff.getTariffName()
                                +"\n * = * = * = * = *");
                    }


                }
            }
        }

    }
}
