package dylan.coder.designpattern.singleton;

public class SingletonSyncClass {
	private static SingletonSyncClass instance;
	
	private SingletonSyncClass() {		
	}	
		
	public static synchronized SingletonSyncClass getInstance(){
		if (instance == null){					
			instance = new SingletonSyncClass();
		}
		return instance;
	}	
}
