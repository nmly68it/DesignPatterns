package dylan.coder.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class DylanChannel implements Subject{
	private static final String MSG_NOTIFICATION = "New video from Dylan Channel: %s";
	
	List<Observer> subscribedObservers;
	
	public DylanChannel() {
		subscribedObservers = new ArrayList<>();
	}
	
	@Override
	public void subscribeChannel(Observer observer) {
		subscribedObservers.add(observer);	
	}

	@Override
	public void unSubscribeChannel(Observer observer) {
		if (subscribedObservers.contains(observer)){
			subscribedObservers.remove(observer);
		}
	}

	@Override
	public void sendNotification(String msg) {
		subscribedObservers.stream().forEach(observer -> observer.displayNotification(msg));		
	}
	
	public void publicVideo(String videoName){		
		sendNotification(String.format(MSG_NOTIFICATION, videoName));
	}	
}
