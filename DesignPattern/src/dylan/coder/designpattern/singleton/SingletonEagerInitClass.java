package dylan.coder.designpattern.singleton;

public class SingletonEagerInitClass {
	 
	private static SingletonEagerInitClass instance = new SingletonEagerInitClass();
	
	private SingletonEagerInitClass() {		
	}	
	
	public static SingletonEagerInitClass getInstance(){
		return instance;
	}	
}
