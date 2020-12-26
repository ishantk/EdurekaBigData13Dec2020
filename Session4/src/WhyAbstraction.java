
abstract class Notification{
	// Regular Method
	void hello() {
		System.out.println("This is hello from Notification");
	}
	
	// Abstract Method
	abstract void notifyUser(String message);
}

class User extends Notification{
	
	void notifyUser(String message) {
		System.out.println("-----------USER-----------");
		System.out.println("Notification Recevied");
		System.out.println(message);
		System.out.println("--------------------------");
	}
}

class YouTubeChannel{
	
	Notification notification;
	
	void subscribe(Notification notification) {
		this.notification = notification;
	}
	
	void postVideo(String videoName) {
		notification.notifyUser("A New Video titled "+videoName+" has been posted :) ");
	}
}

public class WhyAbstraction {

	public static void main(String[] args) {
		
		User john = new User();

		YouTubeChannel ishantsChannel = new YouTubeChannel();
		ishantsChannel.subscribe(john);
		
		ishantsChannel.postVideo("Java Threads");
			
	}

}
