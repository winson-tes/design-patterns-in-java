package builder;

public class Car {
    private String Colour;
	private int Wheels;
	
	private boolean isCarPlayEnabled;

	public String getColour() {
		return Colour;
	}

	public int getWheels() {
		return Wheels;
	}

	public boolean isCarPlayEnabled() {
		return isCarPlayEnabled;
	}
	
	private Car(CarBuilder builder) {
        this.Colour=builder.Colour;
		this.Wheels=builder.Wheels;
		this.isCarPlayEnabled=builder.isCarPlayEnabled;
	}

	public static class CarBuilder{
		private String Colour;
		private int Wheels;

		private boolean isCarPlayEnabled;

		public CarBuilder(String colour, int wheels){
			this.Colour=colour;
			this.Wheels=wheels;
		}

		public CarBuilder setCarPlayEnabled(boolean isCarPlayEnabled) {
			this.isCarPlayEnabled = isCarPlayEnabled;
			return this;
		}
		
		public Car build(){
			return new Car(this);
		}
	}
}