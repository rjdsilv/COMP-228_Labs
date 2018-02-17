package enum_practice;

public class Weather {
	private Type type;
	
	public static enum Type {
		WARM,
		COLD,
		HOT
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
}
