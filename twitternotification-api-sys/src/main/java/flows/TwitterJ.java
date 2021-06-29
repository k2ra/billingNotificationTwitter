package flows;

//import java.util.List;    
import twitter4j.*;
import twitter4j.api.DirectMessagesResources;
import twitter4j.conf.ConfigurationBuilder;
public class TwitterJ {
	
	public static ConfigurationBuilder conexion() {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		  .setOAuthConsumerKey("AvZBhtRKDfEH8YD8OpYHf2Ojc")
		  .setOAuthConsumerSecret("Wne03JrIQvRz27sluugczYPLoSZBI7oNk2CWXDnebfCEz3CYN3")
		  .setOAuthAccessToken("286847247-aRmCLBmKDMOsPtaGqJLLA52WesToiNuM0zl0hNF2")
		  .setOAuthAccessTokenSecret("t9nbqlJyvhJaOnanZ0nQ7UyhPe7zxXpjYzDvB4g5Q8rwN");
		return cb;
	}

	static public  int retrieveNumberId () throws TwitterException {
		ConfigurationBuilder cb = conexion();
		
		Twitter twitter = new TwitterFactory(cb.build()).getInstance();
		
		User usuario = twitter.verifyCredentials();
		 return (int) usuario.getId();
	 }
	
	static public  DirectMessage directMessage (Integer recipientName, String msg) throws TwitterException {
		ConfigurationBuilder cb = conexion();
		Twitter twitter = new TwitterFactory(cb.build()).getInstance();
		
		DirectMessage usuario = twitter.sendDirectMessage(recipientName, msg);
		 return usuario;
	 }
}
