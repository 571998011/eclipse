package scit.ce;

public class MtSQL implements Database {

	public void connectDatabase(String connString) {
		System.out.println("connect MySQL"+connString);

	}

	public void disconnectDatabase() {
		System.out.println("disconnect MySQL");

	}

}
