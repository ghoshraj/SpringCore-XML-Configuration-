package car;

public class Car {
	
	private IEngine eng;
	
	public Car() {
		System.out.println("0-arg");
	}
	public Car(IEngine eng) {
		System.out.println("1-arg");
		this.eng = eng;
	}
	public void setEng(IEngine eng) {
		this.eng = eng;
	}
	
	public void drive() {
		int status = eng.start();
		if(status >= 1) {
			System.out.println("done");
		}
		else {
			System.out.println("Trouble");
		}
	}

}
