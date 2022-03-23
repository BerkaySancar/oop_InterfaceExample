package bankExample;

public class XBank implements IBankProcessing {

    private String bankName;
    private String terminalId;
    private String password;

    public XBank(String bankName, String terminalId, String password) {

        this.bankName = bankName;
        this.terminalId = terminalId;
        this.password = password;
    }
    @Override
    public boolean connect(String ipAddress){
        System.out.println("User ip: " + ipAddress);
        System.out.println("Server ip: " + this.serverIpAddress);
        System.out.println("Connected to " + this.getBankName());
        return true;
    }
    @Override
    public boolean payment(double amount, String cardNumber, String expiryDate, String cvc){
        // ...
        System.out.println("Transaction successful!");
        return true;
    }

    public String getBankName() {
        return this.bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTerminalId() {
        return this.terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
