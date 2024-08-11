package car;

public class PetrolEngine implements IEngine{

	public PetrolEngine() {
		System.out.println("0-arg");
	}
	@Override
	public int start() {
		System.out.println("petrol engine");
		return 1;
	}

}
