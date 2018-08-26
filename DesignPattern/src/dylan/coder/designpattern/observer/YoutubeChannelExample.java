package dylan.coder.designpattern.observer;

public class YoutubeChannelExample {
	public static void main(String[] args) {
		DylanChannel dylanChannel = new DylanChannel();
		Subscriber loki = new Subscriber("Loki");
		Subscriber thor = new Subscriber("Thor");
		Subscriber isaac = new Subscriber("Isaac");
		
		//Loki, Thor and Isaac subscribe Dylan channel		
		dylanChannel.subscribeChannel(loki);
		dylanChannel.subscribeChannel(thor);
		dylanChannel.subscribeChannel(isaac);
		
		//Dylan publics new video, it will send notifications to all subscribers (Loki, Thor and Isaac)
		dylanChannel.publicVideo("How to Observer work!!!");

		System.out.println("\n==== Loki unsubscribed Dylan Channel ====\n");
		
		//If Loki unsubscribes Dylan Channel, he will not be notified from Dylan channel
		dylanChannel.unSubscribeChannel(loki);
		dylanChannel.publicVideo("Hello world");
		
	}
}
