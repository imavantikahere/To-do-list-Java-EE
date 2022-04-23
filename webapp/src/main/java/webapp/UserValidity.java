package webapp;

public class UserValidity {

	public boolean isUserValid(String user, String password) {
		if(user.equals("Avantika") && password.equals("dummy"))
			return true;
		else
			return false;
	}
}
