// NOTE: This example uses the next generation Twilio helper library - for more
// information on how to download and install this version, visit
// https://www.twilio.com/docs/libraries/java
import com.twilio.Twilio;
import com.twilio.rest.notify.service.NotifyUser;
import java.util.ArrayList;

public class Example {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACCOUNT_SID";
  public static final String AUTH_TOKEN = "AUTH_TOKEN";

  public static final String SERVICE_SID = "ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

  public static void main(String[] args) {
    // Initialize the client
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    NotifyUser user = NotifyUser
        .creator(SERVICE_SID)
        .setIdentity("User0001")
        .setSegments(new ArrayList<String>("premium", "fitness-lifestyle"))
        .create();

    System.out.println(user.getSid());
  }
}
