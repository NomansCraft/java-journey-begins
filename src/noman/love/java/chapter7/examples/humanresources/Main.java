package noman.love.java.chapter7.examples.humanresources;

public class Main {

    public static void main(String[] args) {
        HrManager hrManager = new HrManager();

        Client client1 = new Client("Mosharraf", 45);
        hrManager.addClient(client1);

        Client client2 = new Client("Nowshed", 41);
        hrManager.addClient(client2);

        double getTotalFixedPay = hrManager.getTotalPay("FIXED");
        System.out.println("getTotalFixedPay = " + getTotalFixedPay);

        double hourlyTotalPay = hrManager.getTotalPay("HOURLY");
        System.out.println("hourlyTotalPay = " + getTotalFixedPay);
    }
}
