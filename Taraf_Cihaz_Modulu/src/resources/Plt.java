package resources;

public class Plt extends Cihaz {
	
	private int pltA;
	private int pltB;
	private int pltC;
	
	public Plt() {
		super();
	}

	public Plt(int pltA, int pltB, int pltC) {
		super();
		this.pltA = pltA;
		this.pltB = pltB;
		this.pltC = pltC;
	}

	public int getPltA() {
		return pltA;
	}

	public void setPltA(int pltA) {
		this.pltA = pltA;
	}

	public int getPltB() {
		return pltB;
	}

	public void setPltB(int pltB) {
		this.pltB = pltB;
	}

	public int getPltC() {
		return pltC;
	}

	public void setPltC(int pltC) {
		this.pltC = pltC;
	}

	
}
