package bankExample;

public interface IBankProcessing {

    final String serverIpAddress = "127.0.0.1";

    boolean connect(String ipAddress);

    boolean payment(double amount, String cardNumber, String expiryDate, String cvc);

}
