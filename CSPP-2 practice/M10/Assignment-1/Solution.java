import java.util.Scanner;
import java.io.BufferedInputStream;
class Paytm {
	private String phono;
	public int balance;
    //private int[] passbook;

    public Paytm(String phono, int balance) {
    	this.balance = balance;
    	this.phono = phono;
    	//passbook = new int[20];
    }
    public void add(int money) {
    	balance = balance + money;
    }
    public void sendmoney(int money) {
    	balance = balance - money;
    }
}
public class Solution {
	private Solution() {
	}
	public static void main(String[] args) {
		Paytm account = new Paytm("8142686869686",100);
		account.add(250);
		System.out.println(balance);
		account.send(100);
		System.out.println(balance);
	}
}



/*public class Entry {
	private String name;
	private int amount;
	public Entry() {
		amount 
	}

}*/