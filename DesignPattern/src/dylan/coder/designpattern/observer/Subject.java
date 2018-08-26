package dylan.coder.designpattern.observer;

public interface Subject {
	/**
	 * Subscribe Youtube channel 
	 * 
	 * @param observer
	 */
	void subscribeChannel(Observer observer);
	
	
	/**
	 * Subscribe Youtube channel
	 * 
	 * @param observer
	 */
	void unSubscribeChannel(Observer observer);
	
	/**
	 * Notify when new changes on youtube channel
	 * 
	 * @param observer
	 */
	void sendNotification(String msg);	
}
