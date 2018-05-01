package dylan.coder.designpattern.singleton;

public class SingletonSyncClass {
	private static SingletonSyncClass instance;
	
	private SingletonSyncClass() {		
	}	
		
	public static SingletonSyncClass getInstance(){
		//Check NULL for instance, if instance is not created yet, enter the synchronize block. 
		//If instance is already created, we return instance, not enter to synchronize block =>> Not impact to performance
		if (instance == null){
			//We only synchronize that first time
			synchronized (SingletonSyncClass.class) {
				//Check null again, make sure only one thread can be create instance
				if (instance == null){					
					instance = new SingletonSyncClass();
				}
			}				
		}
		return instance;
	}	
}
