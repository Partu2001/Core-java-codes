package Examples;

public class Account {
	static float inetrestRate;
	static {
		inetrestRate=7.7f;
	}
	public static float getInetrestRate() {
		return inetrestRate;
	}
	public static void main(String [] args) {
		float Show=Account. getInetrestRate();
		System.out.println(Show);
		
	}

}
