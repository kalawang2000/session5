public class Building extends Office {
	public Building() {
		//super();
		System.out.println("A new building has been constructed!");
	}
	@Override
	public void La(int a) {
		System.out.println("the lot area of the building is " + a + "sqm");
	}

}