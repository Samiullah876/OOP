public class account {
    public int balance;
    public account(){
        balance=12000;
    }
    public account(int a,int b){
        balance=a;
    }
    public int withdraw(int w){
        return (balance-w);
    }
    public int deposit(int d){
        return(balance+d);
    }
    public static void main(String[] args){
        account a=new account();
        System.out.println(a.withdraw(3000));
        account b=new account();
        System.out.println(b.deposit(4000));
    }
}
