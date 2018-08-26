package dylan.coder.designpattern.observer;

public class Subscriber implements Observer{

	private String username;
	
	public Subscriber(String username) {
		this.username = username;
	}
	
	@Override
	public void displayNotification(String msg) {
		System.out.println(username + " - " + msg);		
	}
	
}
