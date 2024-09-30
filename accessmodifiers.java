public class accessmodifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Devanshu";
        System.out.println(myAcc.username);
        myAcc.setPassword("abcdefghi");



    }
}
class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
        System.out.println(password);
    }
}
