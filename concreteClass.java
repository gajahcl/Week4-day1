package week4.Day1;

public class concreteClass implements DatabseConnection {
	@Override
	public void connect() {
		System.out.println("connection");
	}
	
	@Override
	public void disconnect() {
		System.out.println("dis");
	}
	@Override
	public void executeUpdate() {
		System.out.println("exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		concreteClass opt=new concreteClass();
		opt.connect();
		opt.disconnect();
		opt.executeUpdate();
		
		

	}

}
