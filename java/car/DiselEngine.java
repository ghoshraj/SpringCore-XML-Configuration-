package car;

public class DiselEngine implements IEngine {

	public DiselEngine() {
		System.out.println("0-arg");
	}

	@Override
	public int start() {
		System.out.println("disel engine");
		return 1;
	}

}
