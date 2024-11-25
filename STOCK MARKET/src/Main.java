import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder userhistory=new StringBuilder();
        int user=0;
        int rs = 0;
        LinkedHashMap<String,Integer> stocks=new LinkedHashMap<>();
        stocks.put("TATA STEEL",145);
        stocks.put("JSW STEEL",175);
        stocks.put("BEL",290);
        stocks.put("SUZLON",75);
        stocks.put("TATA TELE",71);
        LinkedHashMap<String,Integer> Istocks=new LinkedHashMap<>();
        Istocks.put("CASTROL",275);
        Istocks.put("OIL INDIA",320);
        Istocks.put("ENGINEERS INDIA",213);
        Istocks.put("TATA GOLD",7);
        Istocks.put("ETF",60);
        System.out.println("Enter 1 to start/ 0 to end!");
        int n=1;
        while (n!=0)
        {
            System.out.println("ENTER 1 TO VIEW STOCKS");
            System.out.println("ENTER 2 TO TOP INTRADAY STOCKS^");
            System.out.println("ENTER 3 TO BUY STOCKS");
            int x=sc.nextInt();
            sc.nextLine();
            if(x==1) {
                for (Map.Entry<String, Integer> e : stocks.entrySet()) {
                    System.out.println(e.getKey() + " " + e.getValue());
                }
                System.out.println("..................................................................");
            }
            else if (x==2)
            {
                for (Map.Entry<String, Integer> e : Istocks.entrySet()) {
                    System.out.println(e.getKey() + " " + e.getValue());
                }
                System.out.println("..................................................................");
            }
            else if(x==3) {
                System.out.println("ENTER THE STOCK NAME!");
                for (Map.Entry<String, Integer> e : Istocks.entrySet()) {
                    System.out.println(e.getKey() + " " + e.getValue());
                }
                System.out.println("..................................................................");
                System.out.println("ENTER THE STOCK NAME!");
                String m = sc.nextLine();

                if (Istocks.containsKey(m)) {
                    System.out.println("You have selected the stock! ->" + m);
                    for (Map.Entry<String, Integer> e : Istocks.entrySet())
                    {
                        if (m.equals(e.getValue())) {
                            rs = e.getValue();
                            System.out.println(rs);
                            break;
                        }
                    }
                   // System.out.println("Price: " + rs);

                System.out.println("Press 1 to confirm!");

                int c = sc.nextInt();
                sc.nextLine();
                if (c == 1) {
                    System.out.println("Congratulations! you have bought a stock on " + m );
                    System.out.println("Thank you for buying!");
                } else {
                    System.out.println("Thank you!");
                }
            }
                else {
                    System.out.println("PLEASE ENTER THE VALID NAME!");
                }
            }
        }

    }
}