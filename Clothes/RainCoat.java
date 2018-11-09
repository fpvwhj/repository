package Clothes;

public class RainCoat extends Clothes implements AntiWater {

	public RainCoat() {
		// TODO Auto-generated constructor stub
	}

	public RainCoat(String size) {
		super(size);
		// TODO Auto-generated constructor stub
	}

	public RainCoat(String size, String Color) {
		super(size, Color);
		// TODO Auto-generated constructor stub
	}

	public RainCoat(String size, String color, int prize) {
		super(size, color, prize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void antiwater() {
		// TODO Auto-generated method stub

	}

}
