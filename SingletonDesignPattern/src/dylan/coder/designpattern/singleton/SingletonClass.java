package dylan.coder.designpattern.singleton;

public class SingletonClass {
	//Create private static variable, that is only one instance of this class 
	private static SingletonClass instance;
	
	//Private constructor that avoid creating new instance from other classes
	private SingletonClass() {		
	}	
	
	//Private global access point for other class that get the instance
	public static SingletonClass getInstance(){		
		if (instance == null){
			instance = new SingletonClass();
		}
		return instance;
	}	
}
