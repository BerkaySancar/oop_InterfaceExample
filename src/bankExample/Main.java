package bankExample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = scan.nextInt();

        System.out.print("Enter card no: ");
        String cardNo = scan.next();

        System.out.print("Expiry date: ");
        String expiryDate = scan.next();

        System.out.print("CVC: ");
        String cvc = scan.next();

        System.out.print("Which Bank? \n1) X Bank\n2) Z Bank\nSelect: ");
        int selectBank = scan.nextInt();

        switch (selectBank){
            case 1:
                XBank xPos = new XBank("X Bank","1","1234");
                xPos.connect("127.1.1.1");
                xPos.payment(amount,cardNo,expiryDate,cvc);
                break;
            case 2:
                ZBank zPos = new ZBank("Z Bank", "2", "12345");
                zPos.connect("127.1.1.1");
                zPos.payment(amount,cardNo,expiryDate,cvc);
                break;
            default:
                System.out.println("Incorrect entry!");

        }
    }
}
